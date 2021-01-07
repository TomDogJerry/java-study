package com.hqyj.cl.day7.testString;

public class DemoStringMethod {
    public static void main(String[] args) {
        String s1 = new String("qwer");
        String s2 = new String("qwer");
        String s3 = "qwer";
        String s4 = "qwer";
        //public boolean equals (Object anObject) ：将此字符串与指定对象进行比较。
        //equals()方法，用于引用类型数据进行比较时，比较的是数据中的值
        boolean b = s1.equals(s2);
        System.out.println(b);

        //public boolean equalsIgnoreCase (String anotherString) ：将此字符串与指定对象进行比较，忽略大小写
        String s5 = new String("QWER");
        boolean b1 = s1.equalsIgnoreCase(s5);
        System.out.println(b1);

        //public int length () ：返回此字符串的长度。
        int length = s1.length();
        System.out.println(length);

        //public String concat (String str) ：将指定的字符串连接到该字符串的末尾。
        String s6 = "java";
        String s7 = s6.concat(" easy");
        System.out.println(s7);

        //public char charAt (int index) ：返回指定索引处的 char值。
        String s8 = "abcdefg";
        char ch = s8.charAt(5);
        System.out.println(ch);

        //public int indexOf (String str) ：返回指定子字符串第一次出现在该字符串内的索引。
        String s9 = "hellohello";
        String s10 = " ";
        //String s11 = "hello";
        int i = s9.indexOf(s10);
        //System.out.println(s9.indexOf("world"));
        //int j = s9.indexOf(s11);
        System.out.println(i);
        //System.out.println(j);

        //public String substring (int beginIndex, int endIndex) ：返回一个子字符串，从beginIndex到 endIndex截取字符串。
        // 含beginIndex，不含endIndex。 [beginIndex,endIndex)
        String s12 = "java easy";
        String s13 = s12.substring(1);
        System.out.println(s13);
        String s14 = s12.substring(1,3);
        System.out.println(s14);

        //public char[] toCharArray () ：将此字符串转换为新的字符数组。
        String s15 = "good good study,day day up";
        char[] chars = s15.toCharArray();
        for (char ch1 : chars) {
            System.out.print(ch1 + " ");
        }
        System.out.println();
        //public byte[] getBytes () ：使用平台的默认字符集将该 String编码转换为新的字节数组。
        byte[] bytes = s15.getBytes();
        for (byte by : bytes) {
            System.out.print(by + " ");
        }
        System.out.println();
        //public String replace (CharSequence target, CharSequence replacement) ：
        // 将与target匹配的字符串使用replacement字符串替换。
        String s16 = "hello world";
        String s18 = "你好 世界";
        //String s17 = s16.replace("hello","goodbye");
        //System.out.println(s17);
        System.out.println(s16.replace(s16,s18));

        //public String[] split(String regex) ：将此字符串按照给定的regex（规则）拆分为字符串数组。
        String s19 = "再|见#了|我的|世界";
        String[] strings = s19.split("[|]");
        for (String str : strings) {
            System.out.print(str + " ");
        }
    }
}

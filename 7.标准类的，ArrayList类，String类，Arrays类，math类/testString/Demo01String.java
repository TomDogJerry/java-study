package com.hqyj.cl.day7.testString;

public class Demo01String {
    public static void main(String[] args) {
        /*
        * Java程序中所有的字符串文字（例如 "abc" ）都可以被看作是实现此类的实例
        * */
        //String s1 = "小红";
        /*
        * 1、字符串不变：字符串的值在创建后不能被更改。
        * 2、因为String对象是不可变的，所以它们可以被共享。
        * 3、"abc" 等效于 char[] data={'a','b','c'}。
        * 4、String底层是靠字符数组实现的。(JDK8及以前是字符数组，char[]；JDK9及以后是字节数组byte[])
        * */

        //public String() ：初始化新创建的 String对象，以使其表示空字符序列。
        String s1 = new String();
        System.out.println(s1);

        //public String(char[] value) ：通过当前参数中的字符数组来构造新的String。
        char[] ch = new char[]{'a','b','c'};
        String s2 = new String(ch);
        System.out.println(s2);

        //public String(byte[] bytes) ：通过使用平台的默认字符集解码当前参数中的字节数组来构造新的String。
        byte[] bytes = {97,98,99};
        String s3 = new String(bytes);
        System.out.println(s3);

        //String s = “aaa”: 直接赋值方式创建字符串对象，内容就是aaa。
        String s4 = "abc";
        String s6 = "abc";
        System.out.println(s4);
    }
}
package com.hqyj.cl.day8.testStatic;

public class TestDemoStatic {
    public static void main(String[] args) {
//        DemoStatic ds = new DemoStatic();
//        ds.setName("张三");
//        ds.setAge(28);
//        DemoStatic.className = "Java 1 班";
//        ds.show();
//        DemoStatic ds1 = new DemoStatic("李四",30);
//        DemoStatic.className = "";
//        ds1.show();
//        ds.show();

        DemoStatic ds2 = new DemoStatic("孙悟空",22);
        DemoStatic ds3 = new DemoStatic("猪八戒",23);
        DemoStatic ds4 = new DemoStatic("唐僧",24);
        DemoStatic ds5 = new DemoStatic("六耳泥猴",25);
        DemoStatic ds6 = new DemoStatic("哪吒",26);
        DemoStatic ds7 = new DemoStatic();
        System.out.println(ds7.number);
    }
}

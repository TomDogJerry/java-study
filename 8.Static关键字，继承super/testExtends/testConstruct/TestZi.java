package com.hqyj.cl.day8.testExtends.testConstruct;

public class TestZi {
    public static void main(String[] args) {
        Zi zi = new Zi();
        System.out.println(zi.getName() + "," + zi.getAge());
        Zi zi1 = new Zi("张三");
        System.out.println(zi1.getName() + "," + zi1.getAge());
    }
}

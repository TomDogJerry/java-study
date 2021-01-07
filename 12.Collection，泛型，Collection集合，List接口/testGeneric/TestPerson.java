package com.hqyj.cl.day12.testGeneric;

public class TestPerson {
    public static void main(String[] args) {
//        Person p = new Person();
//        p.setName("张三");
        Person<Integer> p = new Person<>();
        p.setName(1);
        System.out.println(p.getName());
        Person<String> p1 = new Person<>();
        p1.setName("王五");
        System.out.println(p1.getName());
    }
}

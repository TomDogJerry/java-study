package com.hqyj.cl.day6.test01;

/*
* 测试类
* */
public class TestPerson {
    public static void main(String[] args) {
        Person p = new Person("小明",18);
//        p.setName("李华");
//        p.setAge(18);
//        System.out.println(p.getName() + "," + p.getAge());
//
//        Person p1 = p;
//        System.out.println(p1.getName() + "," + p1.getAge());//null 0
//        p1 = null;
//        System.out.println(p.getName());
        //System.out.println(p1.getName());

        System.out.println(p.getName() + " " + p.getAge());
    }
}

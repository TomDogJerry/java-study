package com.hqyj.cl.day5.user;

public class TestPerson {
    public static void main(String[] args) {
        /*
        * 测试类
        * */
        //创建Person对象p
        Person p = new Person();
        System.out.println("我的名字是:" + p.name + ",我的年龄是:" + p.age);
        p.write();

        Person p1 = new Person();
        p1.age = 13;
        System.out.println(p.age);//19
        System.out.println(p1.age);//13

    }
}

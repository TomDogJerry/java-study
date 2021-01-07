package com.hqyj.cl.day12.testGeneric;

public class TestPerson02 {
    public static void main(String[] args) {
        Person02 p = new Person02();
        p.methodA("HELLO");
        p.methodA(1);

        Person02.methodB("泛型的静态方法");
    }
}

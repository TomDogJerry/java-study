package com.hqyj.cl.day10.testFinal;

//final修饰的成员变量，在赋值的时候，只能二选一，要么定义是给值，要么构造函数给值
public class Student {
    private final String name;
    private int age;

    public Student(int age,String name) {
        this.age = age;
        this.name = name;
    }

    public Student(String name){
        this.name = name;
    }
//    public void setName(String name){
//        this.name = name;
//    }


}

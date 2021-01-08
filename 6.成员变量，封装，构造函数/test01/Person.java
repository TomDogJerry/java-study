package com.hqyj.cl.day6.test01;
/*
* 按照封装格式要求，定义一个Person类，属性，姓名，年龄；测试类访问并输出
* */
public class Person {
    private String name;
    private int age;
    private String sex;
//    private String className;
//    private int height;

    //定义一个无参构造方法
    public Person(){

    }
    //定义一个有参构造
    public Person(String name){
        this.name = name;
    }

    public Person(int age){
        this.age = age;
    }

    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

//    public Person(String sex){
//        this.sex = sex;
//    }

    //set方法,用来设置私有属性的值
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    //get方法,用来访问私有属性
    public String getName(){
//        String n = name;
//        return n;
        return name;
    }
    public int getAge(){
        return age;
    }

}

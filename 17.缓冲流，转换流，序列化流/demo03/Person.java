package com.hqyj.cl.day17.demo03;

import java.io.Serializable;

/*
* 序列化对象类
* 类的序列化由实现java.io.Serializable接口的类启用。
* 不实现此接口的类将不会使任何状态序列化或反序列化。
* */
public class Person implements Serializable {
    private String name;
    private int age;
    //static关键字修饰的成员变量，不能被序列化
    //static String address;
    //transient关键字，不能被序列化
    private transient String address;
    //序列化版本号
    private static final long serialVersionUID = 42L;

    public Person() {
    }

    public Person(String name, int age,String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }
}

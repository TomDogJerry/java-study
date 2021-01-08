package com.hqyj.cl.day8.testExtends.testConstruct;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Fu {
    String name;
    int age;

    public Fu() {
    }

    public Fu(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
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

    public void show(){

    }
}

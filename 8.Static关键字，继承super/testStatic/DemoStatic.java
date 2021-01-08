package com.hqyj.cl.day8.testStatic;

public class DemoStatic {
    /*
    * 类变量:储存在静态区，每一个类的类变量，只有一份，所有对象共享这一份
    * */
    static String className;
    String name;
    int age;
    static int number;

    public DemoStatic() {
    }

    public DemoStatic(String name, int age) {
        number++;
        this.name = name;
        this.age = age;
    }

    public static String getClassName() {
        return className;
    }

    public static void setClassName(String className) {
        DemoStatic.className = className;
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
        System.out.println("姓名:" + this.name + ",年龄:" + this.age + ",班级:" + className);
    }
}

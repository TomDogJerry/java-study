package com.hqyj.cl.day8.testExtends.test1;
/*
* 子类
*
* */
public class Teacher extends Employee{
    int num1 = 20;
    int age = 28;

    @Override
     public void Fu(){
//        System.out.println("父类的年龄：" + super.age);
//        System.out.println("子类的年龄：" + this.age);
        System.out.println("这是子类方法");

    }

    public void Zi(){
        System.out.println("这是子类独有方法");
    }
}

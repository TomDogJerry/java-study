package com.hqyj.cl.day9.test01;

/*
* 普通类实现接口，必修重写接口中所有的抽象方法
* */
public class InterfaceDemo01Impl implements InterfaceDemo01{

    @Override
    public void methodA() {
        System.out.println("重写了接口中的抽象方法");
    }

    @Override
    public void methodB() {
        System.out.println("这是一个重写接口中的默认方法");
    }


}
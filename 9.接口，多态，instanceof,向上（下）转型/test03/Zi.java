package com.hqyj.cl.day9.test03;

public class Zi extends Fu{
    @Override
    public void methodA() {
        System.out.println("这是子类重写的父类方法methodA");
    }

    public void methodC(){
        System.out.println("这是子类独有的方法methodC");
    }
}

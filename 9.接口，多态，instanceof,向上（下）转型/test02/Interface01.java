package com.hqyj.cl.day9.test02;

public interface Interface01{
    public abstract void methodA();

    public abstract void methodC();

    public default void methodD(){
        System.out.println("这是一个接口中的方法");
    }

}

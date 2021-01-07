package com.hqyj.cl.day12.testGeneric;
/*
* 泛型类，在创建对象的时候，确定数据的类型是什么类型
* */
public class Person02 {

    //定义一个泛型的方法
    public <E> void methodA(E e){
        System.out.println(e);
    }

    //定义一个泛型的静态方法
    public static <E> void methodB(E e){
        System.out.println(e);
    }
}

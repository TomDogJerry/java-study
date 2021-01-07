package com.hqyj.cl.day12.testGeneric;
/*
* 泛型类，在创建对象的时候，确定数据的类型是什么类型
* */
public class Person<E> {
    private E name;

    public Person(){

    }
    public Person(E name){
        this.name = name;
    }

    public void setName(E name){
        this.name = name;
    }

    public E getName(){
        return name;
    }
}

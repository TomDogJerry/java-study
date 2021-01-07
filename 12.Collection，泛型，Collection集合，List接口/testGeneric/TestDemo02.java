package com.hqyj.cl.day12.testGeneric;



import java.util.ArrayList;

public class TestDemo02 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        ArrayList<String> list1 = new ArrayList<>();
        TestDemo02.methodB(list);

        list1.add("hello");
        list1.add("world");
        TestDemo02.methodB(list1);
        //通配符<?>只能用来接收数据，不能用来创建对象
        //ArrayList<?> list2 = new ArrayList<?>();
        //泛型中，没有继承关系
        //ArrayList<Object> list2 = new ArrayList<String>();
    }

    public static void methodB(ArrayList<?> list){
        for (Object o : list) {
            System.out.println(o);
        }
    }
}

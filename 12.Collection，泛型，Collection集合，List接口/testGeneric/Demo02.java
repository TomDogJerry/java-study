package com.hqyj.cl.day12.testGeneric;

import java.util.ArrayList;
import java.util.Collection;

public class Demo02 {
    public static void main(String[] args) {
        //创建四个类型的集合
        /*
        * Integer extends Number extends Object
			String extends Object
        * */

        Collection<Integer> coll = new ArrayList<>();

        Collection<Number> coll1 = new ArrayList<>();

        Collection<String> coll2 = new ArrayList<>();

        Collection<Object> coll3 = new ArrayList<>();
        //调用泛型上限方法
        Demo02.methodA(coll);
        Demo02.methodA(coll1);
        //Demo02.methodA(coll2);//报错
        //Demo02.methodA(coll3);//报错

        //调用泛型下限方法
        //Demo02.mehtodB(coll);//报错
        //Demo02.mehtodB(coll1);//报错
        Demo02.mehtodB(coll2);
        Demo02.mehtodB(coll3);
    }

    //定义泛型上限
    public static void methodA(Collection<? extends Number> coll){
    }

    //定义泛型下限
    public static void mehtodB(Collection<? super String> coll){
    }
}

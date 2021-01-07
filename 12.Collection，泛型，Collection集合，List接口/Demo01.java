package com.hqyj.cl.day12;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
/*
* 不使用泛型的好处：可以存储任意类型的值
*           坏处：可能发生类型转换异常
*
* 使用泛型的好处：可以把错误信息提升到编译期，不会再发生类型转换异常
*         坏处：只能存储对应类型的值
* */
public class Demo01 {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList();
        coll.add("hello");
//        coll.add(1.0);
//        coll.add(1);
        coll.add("java");
        Iterator<String> it = coll.iterator();
        while (it.hasNext()){
            //如果想要用字符串特有方法length()
            String s = (String) it.next();
            System.out.println(s.length());
        }
    }
}

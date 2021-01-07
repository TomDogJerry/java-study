package com.hqyj.cl.day12.testList;

import java.util.ArrayList;
import java.util.List;

/*
*   ① public void add(int index, E element): 将指定的元素，添加到该集合中的指定位置上。
    ② public E get(int index):返回集合中指定位置的元素。
    ③ public E remove(int index): 移除列表中指定位置的元素, 返回的是被移除的元素。
    ④ public E set(int index, E element):用指定元素替换集合中指定位置的元素,返回值为更新前的元素。
* */
public class TestCollections01 {
    public static void main(String[] args) {
        //创建List接口的对象，多态方式
        List<String> list = new ArrayList<>();
        list.add("科比");
        list.add("麦迪");
        list.add("韦德");
        System.out.println(list);//[科比, 麦迪, 韦德]
        //public void add(int index, E element): 将指定的元素，添加到该集合中的指定位置上。
        list.add(0,"詹姆斯");
        System.out.println(list);

        //public E get(int index):返回集合中指定位置的元素。
        String s = list.get(3);
        System.out.println(s);

        //public E remove(int index): 移除列表中指定位置的元素, 返回的是被移除的元素。
        String s1 = list.remove(1);
        System.out.println(s1);
        System.out.println(list);

        //public E set(int index, E element):用指定元素替换集合中指定位置的元素,返回值为更新前的元素。
        String s2 = list.set(0,"高斯林");
        System.out.println(s2);
        System.out.println(list);

    }
}



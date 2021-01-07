package com.hqyj.cl.day7.testArrayList;

import java.util.ArrayList;

public class TestArrayList {
    public static void main(String[] args) {
        /*
        * <E>表示泛型，也就是指定了这个ArrayList集合中存储元素的类型
        * 泛型，必须是引用类型
        * */
        // ArrayList<String> list = new ArrayList<String>();
        ArrayList<String> list = new ArrayList<>();
        //定义三个String类型的数据
        String s1 = "张三";
        String s2 = "李四";
        String s3 = "王五";
        System.out.println(list);//[]

        //add(E e)方法
        boolean b = list.add(s1);
        System.out.println(b);
        list.add(s2);
        list.add(s3);
        System.out.println(list);

        //remove(int index)方法
//        list.remove(1);
//        System.out.println(list);

        //get(int index)方法
        String str = list.get(2);
        System.out.println(str);

        int size = list.size();
        System.out.println(size);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        //错误定义
//        ArrayList<double> list1 = new ArrayList<>();
    }
}

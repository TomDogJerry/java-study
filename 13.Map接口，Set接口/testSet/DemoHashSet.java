package com.hqyj.cl.day13.testSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/*
   hashSet:
     ①不允许存储重复的元素
     ②没有索引,没有带索引的方法,也不能使用普通的for循环遍历
     ③是一个无序的集合,存储元素和取出元素的顺序有可能不一致
     ④底层是一个哈希表结构(查询的速度非常的快)
* */
public class DemoHashSet {
    public static void main(String[] args) {
        //创建hashSet对象，多态的方式创建
        Set<Integer> set = new HashSet<>();
        //存入数据，使用add方法
        set.add(2);
        set.add(1);
        set.add(3);
        System.out.println(set);//[1, 2, 3]  Set接口存入元素和取出元素的顺序可能不一样

        //再往set集合中添加一个已经存在的元素
//        set.add(1);
//        System.out.println(set);//[1, 2, 3] Set接口不允许存储重复的元素

        //使用迭代器的方式遍历set集合
        //创建迭代器对象
        Iterator<Integer> it = set.iterator();
        //通过while循环遍历
//        while (it.hasNext()){
//            //取出元素
//            Integer n = it.next();//换成int类型变量来接收数据，自动拆箱
//            System.out.println(n);
//        }

        //创建一个LinkedHashSet()集合对象
        Set<Integer> set1 = new LinkedHashSet<>();
        //向set1集合中存入元素
        set1.add(2);
        set1.add(1);
        set1.add(3);
        System.out.println(set1);//[2, 1, 3]

    }
}

package com.hqyj.cl.day13.testSet.demo;

import java.util.HashSet;
import java.util.Set;

public class TestPerson02 {
    public static void main(String[] args) {
        //创建Set集合对象
        Set<Person> set = new HashSet<>();
        //向集合中添加数据
        /*
        * 自定义类型时，需要重写hashCode()和equals()方法
        * 保证存入set集合中元素不会重复
        * */
        set.add(new Person("张三",12));
        set.add(new Person("李四",13));
        set.add(new Person("王五",14));
        set.add(new Person("王五",14));
        System.out.println(set);
    }
}

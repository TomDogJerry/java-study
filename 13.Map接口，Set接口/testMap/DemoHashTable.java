package com.hqyj.cl.day13.testMap;

import java.util.Hashtable;
import java.util.Map;

public class DemoHashTable {
    public static void main(String[] args) {
        //创建一个map对象
        //hashtable是一个单线程的，线程安全，但是效率低
        Map<String,String> map = new Hashtable<>();
        map.put("张三","李四");
        map.put("王五","赵六");
        System.out.println(map);

        //vector是一个单线的，线程安全，但是效率低
    }
}
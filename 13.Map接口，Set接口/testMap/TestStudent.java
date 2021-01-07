package com.hqyj.cl.day13.testMap;

import java.util.HashMap;
import java.util.Map;

public class TestStudent {
    public static void main(String[] args) {
        //先创建map集合对象
        Map<Student,String> map = new HashMap<>();
        //添加元素
        map.put(new Student("小明",12),"成都");
        map.put(new Student("小红",13),"西安");
        map.put(new Student("小紫",14),"北京");
        System.out.println(map);
        map.put(new Student("小明",12),"成都");
        System.out.println(map);
    }
}

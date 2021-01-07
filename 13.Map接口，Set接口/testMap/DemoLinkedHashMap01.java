package com.hqyj.cl.day13.testMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class DemoLinkedHashMap01 {
    public static void main(String[] args) {
        //创建Map对象
        Map<String,String> map = new LinkedHashMap<>();
        Map<String,String> map1 = new HashMap<>();
        //添加元素
        map.put("东方不败","令狐冲");
        map.put("独孤求败","小明");
        map.put("陈赫","张三");

        map1.put("东方不败","令狐冲");
        map1.put("独孤求败","小明");
        map1.put("陈赫","张三");
        System.out.println(map);

        System.out.println(map1);

    }
}

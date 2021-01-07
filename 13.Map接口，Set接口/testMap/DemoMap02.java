package com.hqyj.cl.day13.testMap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DemoMap02 {
    public static void main(String[] args) {
        //创建map集合对象，多态方式
        Map<String,String> map = new HashMap<>();
        //往map集合中添加元素
        map.put("黄晓明","杨颖");
        map.put("吴奇隆","刘诗诗");
        map.put("冯绍峰","赵丽颖");
        map.put("尹志平","小龙女");
        //System.out.println(map);

        //`public Set<K> keySet()`: 获取Map集合中所有的键，存储到Set集合中。
        Set<String> set = map.keySet();
        System.out.println(set);
        //增强for循环遍历出map集合元素，通过键获取到对应的值
        for (String s : set) {
            //`public V get(Object key)`：根据指定的键，在Map集合中获取对应的值。
            String str = map.get(s);
            System.out.print(str + " ");
        }
        System.out.println();
        Map<String,Integer> map1 = new HashMap<>();
        //添加元素
        map1.put("小明",23);
        //map1.put(null,null);
        map1.put(null,2);
        map1.put("张三",null);
        //遍历集合元素
        Set<String> set1 = map1.keySet();
        //引用类型为null，可以赋值给一个int类型的不？？

        for (String i : set1) {
            Integer i1 = map1.get(i);//最好不要用int来接收，就是包装类Integer
            System.out.println(i1);
        }
    }
}

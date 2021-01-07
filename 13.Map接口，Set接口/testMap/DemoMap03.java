package com.hqyj.cl.day13.testMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//`public Set<Map.Entry<K,V>> entrySet()`: 获取到Map集合中所有的键值对对象的集合(Set集合)。
public class DemoMap03 {
    public static void main(String[] args) {
        //创建集合对象，多态方式
        Map<String,String> map = new HashMap<>();
        //向集合中存入元素
        map.put("张三","李四");
        map.put("王五","赵六");
        map.put("田七","刘八");
        System.out.println(map);//{张三=李四, 王五=赵六, 田七=刘八}

        //`public Set<Map.Entry<K,V>> entrySet()`: 获取到Map集合中所有的键值对对象的集合(Set集合)。
        Set<Map.Entry<String,String>> entrySet = map.entrySet();
        System.out.println(entrySet);//[张三=李四, 王五=赵六, 田七=刘八]


        Iterator<Map.Entry<String, String>> it = entrySet.iterator();
        while (it.hasNext()){
            /*
            *   ① `public K getKey()`：获取Entry对象中的键。
                ② `public V getValue()`：获取Entry对象中的值。
            * */
            Map.Entry<String, String> next = it.next();
            String key = next.getKey();
            String value = next.getValue();
            System.out.println(key + "-->" + value);
        }
        System.out.println("--------------------------");
        //增强for循环的方式
        for (Map.Entry<String,String> se:entrySet){
            System.out.println(se.getKey() + "-->" + se.getValue());
        }
    }
}

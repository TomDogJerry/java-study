package com.hqyj.cl.day14.test01;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestPhone {
    public static void main(String[] args) {
        //创建map集合对象
        Map<Phone,String> map = new HashMap<>();
        //在创建Phone类的几个对象
        Phone p1 = new Phone("华为",3599);
        Phone p2 = new Phone("小米",3999);
        Phone p3 = new Phone("摩托罗拉",2999);
        //把元素传入map集合中
        map.put(p1,"深圳");
        map.put(p2,"武汉");
        map.put(p3,"外国");
        System.out.println(map);//{Phone{brand='摩托罗拉', price=2999}=外国, Phone{brand='小米', price=3999}=武汉, Phone{brand='华为', price=3599}=深圳}
        //通过键来获取值
        String s = map.get(p1);
        System.out.println(s);//深圳
        String s1 = map.get(null);
        System.out.println(s1);//null
        //通过键移除对应的值
        //String r = map.remove(p3);
        //System.out.println(r);//外国
        //判断这个键是否存在
        boolean b = map.containsKey(p1);
        System.out.println(b);//true
        boolean b1 = map.containsKey(null);
        System.out.println(b1);//false
        //遍历map结合
        //方式一：先获取所有的键，存入set集合中
        Set<Phone> keys = map.keySet();
        System.out.println(keys);//[Phone{brand='摩托罗拉', price=2999}, Phone{brand='小米', price=3999}, Phone{brand='华为', price=3599}]
        for (Phone key : keys) {
            System.out.print(map.get(key) + " ");//外国 武汉 深圳
        }
        //方式二：把每个键值对存入set集合中
        Set<Map.Entry<Phone, String>> et = map.entrySet();
        for (Map.Entry<Phone, String> pse : et) {
            System.out.println(pse.getKey() + "--->" + pse.getValue());//Phone{brand='摩托罗拉', price=2999}--->外国    Phone{brand='小米', price=3999}--->武汉
            //            Phone{brand='华为', price=3599}--->深圳
        }
    }
}

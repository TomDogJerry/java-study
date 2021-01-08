package com.hqyj.cl.day5.test;

public class TestPhone {
    public static void main(String[] args) {
        //创建对象
        Phone p = new Phone();
        //赋值
        p.brand = "荣耀";
        p.price = 1000;
        System.out.println("手机品牌是:" + p.brand + " ,价格为:" + p.price);
        //输出  品牌+打电话
        System.out.print(p.brand);
        p.call();
        System.out.println();
        //输出 品牌+发短信
        System.out.print(p.brand);
        p.sendMessage();
    }
}

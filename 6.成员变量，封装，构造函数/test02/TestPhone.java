package com.hqyj.cl.day6.test02;

public class TestPhone {
    public static void main(String[] args) {
        Phone p1 = new Phone("华为",3999);
        System.out.println(p1.getName() + "," + p1.getPrice());

        Phone p2 = new Phone("小米",2999,100);
        System.out.println(p2.getName() + "," + p2.getPrice() + "," + p2.getNumber());

        Phone p3 = new Phone();
        p3.setName("华为");
        p3.setPrice(3999);
        System.out.println(p3.getName() + "," + p3.getPrice());

        Phone p4 = new Phone();
        p4.setName("小米");
        p4.setPrice(2999);
        p4.setNumber(100);
        System.out.println(p4.getName() + "," + p4.getPrice() + "," + p4.getNumber());

        //String name = p1.getName();
        p1.setName( p1.getName());
        p1.setPrice(p1.getPrice() * 2/3);
        System.out.println(p1.getName() + "," + p1.getPrice());
    }
}

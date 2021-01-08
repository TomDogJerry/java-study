package com.hqyj.cl.day10.testInnerClass02;

public class TestInterface02 {
    public static void main(String[] args) {
         new Interface02() {
            @Override
            public void show() {
                System.out.println("这是一个show方法");
            }

             @Override
             public void show1() {
                 System.out.println("show1");
             }
         }.show();

    }

    public static void show2(Interface02 i){
        i.show();
    }
}

package com.hqyj.cl.day10.testFinal;

public class TestDemo02 {
    public static void main(String[] args) {
        final Demo02 d = new Demo02();
        //d = new Demo02(); final修饰的引用类型，不能重新指向新地址
        final int a = 1;
        final int b;
        b = 2;
    }
}

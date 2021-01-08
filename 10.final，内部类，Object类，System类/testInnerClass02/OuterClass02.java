package com.hqyj.cl.day10.testInnerClass02;

import java.sql.SQLOutput;

//外部类
public class OuterClass02 {
    private int i = 1;

    public void methodA(){
        int j = 1;
        //局部内部类
        class InnerClass02{

            public void methodB(){
                System.out.println(i);
                System.out.println(j);
            }

        }
        InnerClass02 inner = new InnerClass02();
        inner.methodB();
    }
}

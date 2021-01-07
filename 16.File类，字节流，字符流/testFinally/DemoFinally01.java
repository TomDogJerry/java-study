package com.hqyj.cl.day14.testFinally;
/*
* finally代码块：无论是否发生异常，这里面的代码，都会执行
*
* */
public class DemoFinally01 {
    public static void main(String[] args) {
/*        int[] arr = {};
        try {
            int i = methodA(arr);
        }catch (NullPointerException n){
            System.out.println(n);
        }finally {
            System.out.println("这是finally代码块内容");
        }
        System.out.println("这是try-catch-finally代码块外的内容");*/
        int[] arr = {1};
        int i = methodB(arr);
        System.out.println(i);

        //finally代码块不可以单独使用
//        finally{
//
//        }

        //try和多个catch连用的时候，catch捕获的异常类型要不一样
        //try和多个catch连用的时候,catch捕获异常的类型，子类在前，父类在后面
        try {

        }catch (Exception n){
            System.out.println(n);
        }/*catch (NullPointerException n){
            System.out.println(n);
        }*/
        /*catch (NullPointerException e){
            System.out.println(e);
        }*/
    }

    public static int methodA(int[] arr){
        if (arr == null){
            throw new NullPointerException("空指针异常");
        }

        return 1;
    }
    //如果在try-catch-finally代码块中，try代码块有return语句，但是finally代码块里面也有return语句，那么try代码块的return语句就会被覆盖掉
    //始终返回的是finally代码块中的内容
    public static int methodB(int[] arr){
        try {
            int i = arr[0];
            return 1;
        }catch (ArrayIndexOutOfBoundsException a){
            System.out.println(a);
        }finally {
            return 100;
        }
    }
}

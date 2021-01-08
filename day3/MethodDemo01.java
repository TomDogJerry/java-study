package com.hqyj.cl.day3;

import java.util.Scanner;

public class MethodDemo01 {

    //注意：方法定义在类中，方法外

    public static void getAge(){
        System.out.println("age = " + 18);
        //methodB();
        int a;
    }

    public static void methodB(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = a > b ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println(max);
    }

    public static void main(String[] args) {
        //调用getAge方法
        //getAge();
//        MethodDemo01.getAge();
        //methodB();
    }
}

package com.hqyj.cl.day2.homework;

public class Test02 {
    public static void main(String[] args) {
        int sum = 0;
        int a = 0;
        for (int i = 0; i < 5; i++) {
            a = a * 10 + 2;// 2 22
            sum = sum + a;// 2 24
        }
        System.out.println(sum);
    }
}

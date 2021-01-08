package com.hqyj.cl.day2.homework;

public class Homework4 {
    /*
     * 4.用for循环求2+22+222+2222+22222+…的和
     * */
    public static void main(String[] args) {
        int a = 0;
        int sum = 0;
        for (int n = 1; n <= 5; n++) {
            a = (a * 10) + 2;
            sum += a;
        }
        System.out.println("sum=" + sum);


//        int b = 0;
//        int sum1 = 0;
//        for (int i = 0; i < 5; i++) {
//            b += (2 * Math.pow(10,i));
//            sum1 = sum1 + b;
//        }
//        System.out.println("sum1 = " + sum1);
    }
}

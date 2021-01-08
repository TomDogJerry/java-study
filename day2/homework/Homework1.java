package com.hqyj.cl.day2.homework;

public class Homework1 {
    /*
    * 1.输出1~100内前5个可以被3整除的数
    * */
    public static void main(String []args) {
        int num = 0;
        int i = 1;
        while (i <= 100) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
                num++;
            }
            if (num == 5) {
                break;
            }
            i++;
        }
    }
}

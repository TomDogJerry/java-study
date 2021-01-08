package com.hqyj.cl.day3;

import java.util.Scanner;

public class PrintDemo {
    public static void main(String[] args) {
        /*
         *  打印三角形
         * */
        int a = 3;
        for (int i = 3; i >= 1; i--) {
            for (int j = 1; j <= a - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

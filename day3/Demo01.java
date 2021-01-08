package com.hqyj.cl.day3;

import java.util.Random;
import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {
//            if (i == 3){
//                continue;
//            }
//            System.out.println(i);
//        }
//        Random r = new Random();
//        int num = r.nextInt(10) + 1;
//        Scanner sc = new Scanner(System.in);
//        while (true){
//            System.out.println("输入一个整数：");
//            int guessNum = sc.nextInt();
//            if (guessNum > num){
//                System.out.println("太大了");
//            }else if (guessNum < num){
//                System.out.println("太小了");
//            }else {
//                System.out.println("猜对了");
//                break;
//            }
//        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

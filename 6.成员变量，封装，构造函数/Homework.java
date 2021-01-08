package com.hqyj.cl.day6;

import java.util.Random;
import java.util.Scanner;

public class Homework {
    //得到随机数对象
    public Random getRandom(){
        return new Random();
    }
    //得到输入对象
    public Scanner getScanner(){
        return new Scanner(System.in);
    }
    //定义一个猜数字的方法
    public void guessNumber(Scanner sc,Random r){
        int i = r.nextInt(100);
        while (true){
            int j = sc.nextInt();
            if (j < i){
                System.out.println("太小了");
            }else if (j > i){
                System.out.println("太大了");
            }else {
                System.out.println("猜对了");
                break;
            }
        }
    }
}

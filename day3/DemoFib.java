package com.hqyj.cl.day3;

public class DemoFib {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1;i <= 10; i++) {
            System.out.print(fib(i) + " ");
            sum += fib(i);
        }
        System.out.println();
        System.out.println("前十项和为：" + sum);
    }

    public static int fib(int i){
        if (i == 1 || i == 2){
            return 1;
        }
        return fib(i - 1) + fib(i - 2);
    }
}

package com.hqyj.cl.day3;

public class Demo02 {
    public static void main(String[] args) {

        int sum = methodA(1);
        System.out.println(sum);
    }

    public static int methodA(int i){
        if (i == 100){
            return 100;
        }
        return i + methodA(++i);
    }
}

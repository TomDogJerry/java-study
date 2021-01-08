package com.hqyj.cl.day4;

public class TestArr02 {
    public static void main(String[] args) {
        int[] arr = new int[3];
//        methodA(arr);
        arr = null;
        System.out.println(arr[0]);
    }

    public static void methodA(int[] arr){
        arr = null;
    }
}

package com.hqyj.cl.day4;

public class TestArr05 {
    /*
    * 数组作为方法的参数
    * */
    public static void main(String[] args) {
        int[] arr = methodB();
        methodA(arr);
    }

    public static void methodA(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] methodB(){
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        return arr;
    }
}

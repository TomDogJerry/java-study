package com.hqyj.cl.day5;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr = {1,2};
//        methodA(arr);
//        System.out.println(arr);//地址
//        System.out.println(arr[0]);//12
        int[] array = methodB();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void methodA(int[] arr) {
        arr[0] = 12;
        arr = null;
        System.out.println(arr);//null
        System.out.println(arr[0]);//空指针异常
    }

    public static int[] methodB(){
        int[] array = new int[]{1,2,3,4};
        return array;
    }
}

package com.hqyj.cl.day4;

public class TestArr04 {
    public static void main(String[] args) {
//        int[] arr = {1,2,55,66,99,100,28,2};
//        int max = arr[0];
//        for (int i = 1; i < arr.length; i++) {
//            if (max < arr[i]){
//                max = arr[i];
//            }
//        }
//        System.out.println(max);

        int[] arr1 = {1,2,3,4,5};
        for (int i = 0; i < arr1.length/2; i++) {
            int temp = arr1[arr1.length - 1 - i];
            arr1[arr1.length - 1 - i] = arr1[i];
            arr1[i] = temp;
        }

        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }
}

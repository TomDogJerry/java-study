package com.hqyj.cl.day4;

public class TestArr03 {
    public static void main(String[] args) {

        //定义数组
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        //遍历数组arr
        int i = arr[0];
        System.out.println(arr.length);
        for (int j = 0; j <= arr.length - 1; j++) {
            System.out.print(arr[j] + " ");
        }
    }
}

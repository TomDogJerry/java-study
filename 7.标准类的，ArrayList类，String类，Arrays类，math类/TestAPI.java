package com.hqyj.cl.day7;


import java.util.Scanner;

public class TestAPI {
    public static void main(String[] args) {
//        int[] arr1 = new int[]{1,2,3};
//        int[] arr2 = {1,2,3};
//        System.out.println(arr1 == arr2);
        String s1 = new String("abc");
        String s2 = new String("abc");
        String s3 = "abc";
        String s4 = "abc";
        /*
        * 对于引用数据类型而言，==比较的是地址值
        * */
        System.out.println(s1 == s2);//false
        System.out.println(s1 == s3);//false
        System.out.println(s3 == s2);//false
        System.out.println(s3 == s4);//true
    }
}

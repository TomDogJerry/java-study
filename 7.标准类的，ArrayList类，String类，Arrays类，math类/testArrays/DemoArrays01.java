package com.hqyj.cl.day7.testArrays;

import java.util.Arrays;

public class DemoArrays01 {
    public static void main(String[] args) {
        //1、public static String toString(int[] a) ：返回指定数组内容的字符串表示形式。
        int[] arr = {5,6,7,8,1,2,3,4};
        System.out.println(arr);
        //String str = Arrays.toString(arr);
        System.out.println(Arrays.toString(arr));

        //2、public static void sort(int[] a) ：对指定的 int 型数组按数字升序进行排序
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

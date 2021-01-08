package com.hqyj.cl.day10.testSystem;

import java.util.Arrays;

public class TestSystem {
    public static void main(String[] args) {
        // `public static long currentTimeMillis()`：返回以毫秒为单位的当前时间。

//        long beginTime = System.currentTimeMillis();
//        for (int i = 0; i < 999; i++) {
//            System.out.print(i);
//        }
//        System.out.println();
//        System.out.println(System.currentTimeMillis() - beginTime);

        //`public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)`：将数组中指定的数据拷贝到另一个数组中。
        int[] arr = {1,2,3,4,5};
        int[] arr2 = new int[arr.length];
        int[] arr3 = {6,7,8,9,10};
        System.arraycopy(arr,0,arr2,0,5);
        System.out.println(Arrays.toString(arr2));
        System.arraycopy(arr,1,arr3,0,3);
        System.out.println(Arrays.toString(arr3));
    }
}

package com.hqyj.cl.day5;

public class ArrayDemo01 {
    public static void main(String[] args) {
        /*
        * 二维数组的定义和初始化
        * */
        //动态初始化
        int[][] array = new int[1][1];


        int[][] array2 = new int[3][];
        array2[0] = new int[2];
        int i = array2[0][1];
        System.out.println(i);//0
        array2[0][1] = 100;
        System.out.println(array2[0][1]);//100
        System.out.println(array2[0][0]);//0

        int[][] arr = {{1,2,3},{4,5,6}};// 1 2 3 4 5 6
        for (int j = 0; j < arr.length; j++) {
            for (int k = 0; k < arr[j].length; k++) {
                System.out.print(arr[j][k] + " ");
            }
            System.out.println();
        }

        System.out.println("foreach循环:");
        for (int[] n : arr) {
            for (int m : n) {
                System.out.print(m);
            }
            System.out.println();
        }

        

        //静态初始化
        int[][] array3 = new int[][]{{1}};
        int[][] array4 = {{1}};

    }
}

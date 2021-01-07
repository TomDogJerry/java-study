package com.hqyj.cl.day14.testThrow;
/*
* Throw抛出一个异常对象
* */
public class Demo01Throw {
    public static void main(String[] args) {
//        int[] arr = {1,2,3,4};
//        int i = methodA(arr, 4);
//        System.out.println("呵呵呵");
//        System.out.println(i);
//        System.out.println("哈哈哈");
        int[] brr = null;
        int i = methodB(brr);
        System.out.println(i);
    }

    public static int methodA(int[] arr,int index){
        if (index < 0 || index > arr.length-1){
            throw new ArrayIndexOutOfBoundsException("访问的数组下标越界了！！");//抛出异常之后，程序终止运行
        }
        System.out.println("嘻嘻嘻");
            return arr[index];

    }

    public static int methodB(int[] brr){
        if (brr == null){
            throw new NullPointerException("空指针异常");
        }

        return 1;
    }


}

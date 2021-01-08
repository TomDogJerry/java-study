package com.hqyj.cl.day8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ReDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list.add(1);
//        list.add("aa");
        int[] arr = {1,5,3,4};
        Arrays.sort(arr);

        long i = Math.round(1.1);//1
        long i1 = Math.round(1.6);//2
        long i2 = Math.round(-1.5);//-1
        long i3 = Math.round(-1.6);//-2
        long i4 = Math.round(1.5);//2
//        System.out.println(i + " " + i1 + " " + i2 + " " + i3 + " " + i4);
//        System.out.println(Math.round(-10.7));
//        System.out.println(Math.random()*10 + 1);

        String s = "abc";
        s += "abc";
        //abc abcabc
        String s1 = new String();
        System.out.println(s1.length());
        String s2 = " ";
        System.out.println(s2.length());
        char[] ch = {'a','b','c'};
        String s3 = new String(ch);
        System.out.println(s3);
        Scanner sc = new Scanner(System.in);
        System.out.println(sc);
        s = null;
        //System.out.println(s.equals("abc"));
        /*
        * 如果是一个已知的字符串和一个变量字符串 用equals方法比较，把已知的字符串写在前面，可以防止空指针异常
        *
        * */
    }
}

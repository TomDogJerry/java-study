package com.hqyj.cl.day5;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        sc.nextInt();
//        sc.nextInt();
//        int i = new Scanner(System.in).nextInt();
//        System.out.println(i);
//
//        int j = new Scanner(System.in).nextInt();
//        System.out.println(j);

        Test01 t = new Test01();
        t.methodA(new Scanner(System.in));
    }

    public void methodA(Scanner sc){
        System.out.println(sc.nextInt());
    }

    public Scanner methodB(){
        return new Scanner(System.in);
    }
}

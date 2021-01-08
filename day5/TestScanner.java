package com.hqyj.cl.day5;

import java.util.Scanner;

public class TestScanner {
    public static void main(String[] args) {
        TestScanner ts = new TestScanner();
//        Scanner sc = ts.getScanner();
        ts.printScanner(ts.getScanner());
    }

    public Scanner getScanner(){
        //Scanner sc = new Scanner(System.in);
        return new Scanner(System.in);
    }

    public void printScanner(Scanner sc){
//        int i = sc.nextInt();
        System.out.println(sc.nextInt());
    }
}

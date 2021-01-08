package com.hqyj.cl.day3;

public class MethodDemo02 {

    /*
    * 方法的重载：
    *   1、在一个类中
    *   2、方法名相同，和权限修饰符以及返回值类型，没有关系
    *   3、看一个方法是否发生重载，就看参数列表(参数个数，参数类型，参数顺序)
    *
    *
    * */
    public static int add(int a,int b){
        int i = a + b;
        return add(1,2);
    }

    public static  int add(int a,int b,int c){

       return 1;
    }

    public static int add(double a,int b) {
        System.out.println("double int");
        return 1;
    }

    public static double add(int a,double b){
        System.out.println("int double");
        return 1.0;
    }

    public static void main(String[] args) {
//        System.out.println(add(1,2));
//        int i = add(1,2);
//        System.out.println(i);
        add(1.0,2);
        add(1,1.0);
    }
}

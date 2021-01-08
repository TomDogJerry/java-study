package com.hqyj.cl.day5;

import com.hqyj.cl.day4.Demo;

import java.util.Random;

public class DemoTest {

    /*
    * 分析：两个方法
    *   一个方法：返回随机数对象
    *   另一个方法：接收返回的随机数对象，并且打印一个随机数
    *
    * */
    public static void main(String[] args) {
        //创建类DemoTest对象
        DemoTest dt = new DemoTest();

        //调用printRandom方法，传递Random对象过去
        dt.printRandom(dt.getRandom());
    }

    //获取Random对象
    public Random getRandom(){
        return new Random();
    }

    //传递Random对象，打印一个值
    public void printRandom(Random r){
        System.out.println(r.nextInt(10));
    }
}

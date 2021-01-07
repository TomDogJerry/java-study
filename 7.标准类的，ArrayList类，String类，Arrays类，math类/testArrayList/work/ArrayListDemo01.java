package com.hqyj.cl.day7.testArrayList.work;
/*
* 生成6个1~33之间的随机整数,添加到集合,并遍历
* */

import java.util.ArrayList;
import java.util.Random;

public class ArrayListDemo01 {
    public static void main(String[] args) {
        Random r = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            list.add(r.nextInt(33) + 1);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}

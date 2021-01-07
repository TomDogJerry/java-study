package com.hqyj.cl.day12.testCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
*   ①`public static <T> boolean addAll(Collection<T> c, T... elements) `:往集合中添加一些元素。
    ②`public static void shuffle(List<?> list) `:打乱集合顺序。
    ③`public static <T> void sort(List<T> list)`:将集合中元素按照默认规则排序。
    ④`public static void reverse (List<?> list)`:将集合中元素反转。
* */

//如何让两个数字自由组合，4个元素，13个元素，组合成不同的52个元素

public class Demo01 {
    public static void main(String[] args) {
        //创建集合对象
        List<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        System.out.println(list);//[张三, 李四, 王五]
        //`public static <T> boolean addAll(Collection<T> c, T... elements) `:往集合中添加一些元素。
        Collections.addAll(list,"麦迪","科比","姚明");
        System.out.println(list);//[张三, 李四, 王五, 麦迪, 科比, 姚明]

        //`public static void shuffle(List<?> list) `:打乱集合顺序。
        Collections.shuffle(list);
        System.out.println(list);//[王五, 麦迪, 李四, 姚明, 张三, 科比]

        //`public static <T> void sort(List<T> list)`:将集合中元素按照默认规则排序。
        List<Integer> list1 = new ArrayList<>();
        Collections.addAll(list1,1,2,3,7,5,6);
        System.out.println(list1);//[1, 2, 3, 7, 5, 6]
        Collections.sort(list1);
        System.out.println(list1);//[1, 2, 3, 5, 6, 7]

//        for (int i = list1.size() - 1; i >= 0; i--) {
//            System.out.print(list1.get(i) + " ");
//        }
        //`public static void reverse (List<?> list)`:将集合中元素反转。
        Collections.reverse(list1);
        System.out.println(list1);//[7, 6, 5, 3, 2, 1]
    }
}

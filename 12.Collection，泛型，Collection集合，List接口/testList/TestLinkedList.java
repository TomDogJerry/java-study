package com.hqyj.cl.day12.testList;

import java.util.LinkedList;
import java.util.List;

/*
*
*   ① `public void addFirst(E e)`:将指定元素插入此列表的开头。
    ② `public void addLast(E e)`:将指定元素添加到此列表的结尾。
    ③ `public E getFirst()`:返回此列表的第一个元素。
    ④ `public E getLast()`:返回此列表的最后一个元素。
    ⑤ `public E removeFirst()`:移除并返回此列表的第一个元素。
    ⑥ `public E removeLast()`:移除并返回此列表的最后一个元素。
    ⑦ `public E pop()`:从此列表所表示的堆栈处弹出一个元素。
    ⑧ `public void push(E e)`:将元素推入此列表所表示的堆栈。
    ⑨ `public boolean isEmpty()`：如果列表不包含元素，则返回true。
* */
public class TestLinkedList {
    public static void main(String[] args) {
        //创建一个LinkedList集合对象
        LinkedList<String> list = new LinkedList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        System.out.println(list);//[张三, 李四, 王五]
        //`public void addFirst(E e)`:将指定元素插入此列表的开头。
        //LinkedList<String> list1 = (LinkedList<String>) list;
        list.addFirst("赵六");
        System.out.println(list);//[赵六, 张三, 李四, 王五]

        //`public void addLast(E e)`:将指定元素添加到此列表的结尾。
        list.addLast("周末");
        System.out.println(list);//[赵六, 张三, 李四, 王五, 周末]

        //`public E getFirst()`:返回此列表的第一个元素。
        String s = list.getFirst();
        String s1 = list.get(0);
        System.out.println(s);//赵六
        System.out.println(s1);//赵六

        //`public E getLast()`:返回此列表的最后一个元素。
        String s2 = list.getLast();
        System.out.println(s2);//周末
        String s3 = list.get(list.size() - 1);
        System.out.println(s3);//周末

        //`public E removeFirst()`:移除并返回此列表的第一个元素。
        String s4 = list.removeFirst();
        System.out.println(s4);//赵六
        System.out.println(list);//[张三, 李四, 王五, 周末]

        //`public E removeLast()`:移除并返回此列表的最后一个元素。
        String s5 = list.removeLast();
        System.out.println(s5);//周末
        System.out.println(list);//[张三, 李四, 王五]

        //`public E pop()`:从此列表所表示的堆栈处弹出一个元素。
        String s6 = list.pop();
        System.out.println(s6);//张三
        System.out.println(list);//[李四, 王五]

        //`public void push(E e)`:将元素推入此列表所表示的堆栈。
        list.push("田八");
        System.out.println(list);//[田八, 李四, 王五]

        //`public boolean isEmpty()`：如果列表不包含元素，则返回true。
        boolean b = list.isEmpty();
        System.out.println(b);//false

        list.clear();
        System.out.println(list.isEmpty());//true
    }
}

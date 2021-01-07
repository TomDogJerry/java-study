package com.hqyj.cl.day12;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TestIterator {
    public static void main(String[] args) {
        // public Iterator iterator()`: 获取集合对应的迭代器，用来遍历集合中的元素的。
        Collection<String> coll = new ArrayList<>();//多态写法
        //先给集合添加几个元素
        coll.add("姚明");
        coll.add("易建联");
        coll.add("马保国");
        coll.add("李云龙");
        coll.add("拜政华");
        Iterator<String> iterator = coll.iterator();

/*        //② `public boolean hasNext()`:如果仍有元素可以迭代，则返回 true。
        boolean b1 = iterator.hasNext();
        System.out.println(b1);//true
        //① `public E next()`:判断集合中还有没有下一个元素,有就返回改元素,没有就报异常
        String s1 = iterator.next();
        System.out.println(s1);//姚明

        boolean b2 = iterator.hasNext();
        System.out.println(b1);//true
        System.out.println(iterator.next());//易建联*/
        //如果在while循环之上单独进行了一次迭代取值，后面的while循环会接着这个值的下一个元素开始
//        String s3 = iterator.next();
//        System.out.println("================" + s3);
        //while循环
        while (iterator.hasNext()){
            String s = iterator.next();
            System.out.println(s);
        }
        //for循环
        for (Iterator<String> i = coll.iterator();i.hasNext();){
            String str = i.next();
            System.out.println(str);
        }
    }
}

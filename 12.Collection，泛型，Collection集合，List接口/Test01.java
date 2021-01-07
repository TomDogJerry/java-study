package com.hqyj.cl.day12;

import com.sun.xml.internal.messaging.saaj.util.SAAJUtil;

import java.util.ArrayList;
import java.util.Collection;

/*
*
*     public boolean add(E e)：把给定的对象添加到当前集合中。
      public void clear() :清空集合中所有的元素。
      public boolean remove(E e): 把给定的对象在当前集合中删除。
      public boolean contains(E e): 判断当前集合中是否包含给定的对象。
      public boolean isEmpty(): 判断当前集合是否为空。
      public int size(): 返回集合中元素的个数。
      public Object[] toArray(): 把集合中的元素，存储到数组中。
* */
public class Test01 {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        System.out.println(coll);//[]
        //public boolean add(E e)：把给定的对象添加到当前集合中。
        boolean b1 = coll.add("李四");
        coll.add("科比");
        coll.add("C罗");
        coll.add("张三");
        System.out.println(b1);//true
        System.out.println(coll);//[hello man]

        // public boolean remove(E e): 把给定的对象在当前集合中删除。如果该对象存在，返回true，如果该对象不存在，返回false
/*        boolean b2 = coll.remove("C罗");
        System.out.println(b2);//true
        System.out.println(coll);//[李四, 科比, 张三]
        boolean b3 = coll.remove("王五");
        System.out.println(b3);//false
        System.out.println(coll);//[李四, 科比, 张三]*/

        //public boolean contains(E e): 判断当前集合中是否包含给定的对象。如果这个对象存在，返回true，如果不存在，返回false
/*        boolean b4 = coll.contains("科比");
        System.out.println(b4);//true
        System.out.println(coll);//[李四, 科比, C罗, 张三]
        boolean b5 = coll.contains("詹姆斯-高斯林");
        System.out.println(b5);//false
        System.out.println(coll);//[李四, 科比, C罗, 张三]*/

        // public boolean isEmpty(): 判断当前集合是否为空。如果为空，返回true，否则返回false
        boolean b6 = coll.isEmpty();
        System.out.println(b6);//false

        // public int size(): 返回集合中元素的个数。
        int size = coll.size();
        System.out.println(size);//4

        //public Object[] toArray(): 把集合中的元素，存储到数组中。
        Object[] obj = coll.toArray();//李四 科比 C罗 张三
        for (Object o : obj) {
            System.out.print(o + " ");
        }
        System.out.println();
        //public void clear() :清空集合中所有的元素。
        coll.clear();
        System.out.println(coll);//[]
        System.out.println(coll.isEmpty());//true
    }
}

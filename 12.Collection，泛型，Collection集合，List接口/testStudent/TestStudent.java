package com.hqyj.cl.day12.testStudent;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TestStudent {
    public static void main(String[] args) {
        Collection<Student> coll = new ArrayList<>();
        coll.add(new Student("张三",12,"java1班"));
        coll.add(new Student("李四",13,"java2班"));
        coll.add(new Student("王五",22,"java3班"));
        Iterator<Student> it = coll.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}

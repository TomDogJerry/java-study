package com.hqyj.cl.day7.testArrayList.work;

import com.hqyj.cl.day6.test01.Person;

import java.util.ArrayList;

/*
* 自定义4个学生对象,添加到集合,并遍历
* */
public class ArrayListDemo02 {
    public static void main(String[] args) {
        //创建四个对象
        Person p1 = new Person("张三",12);
        Person p2 = new Person("李四",13);
        Person p3 = new Person("王五",14);
        Person p4 = new Person("赵六",15);
        //创建集合
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        persons.add(p4);
        //遍历
        for (Person person : persons) {
            System.out.println(person);
            System.out.println(person.getName() + " " + person.getAge());
        }
    }
}

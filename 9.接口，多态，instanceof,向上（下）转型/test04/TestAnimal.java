package com.hqyj.cl.day9.test04;

public class TestAnimal {
    public static void main(String[] args) {
        Animal a = new Cat();//向上转型
        a.eat();
        Cat cat = (Cat) a;//向下转型
        cat.eat();
        //ClassCastException
        /*
        * 一只cat向上转型之后，要向下转型。
        * */
//        Dog dog = (Dog) a;
//        dog.eat();
        boolean b = a instanceof Cat;
        System.out.println(b);
        boolean c = a instanceof Dog;
        System.out.println(c);
    }
}

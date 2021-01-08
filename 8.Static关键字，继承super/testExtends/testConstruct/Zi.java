package com.hqyj.cl.day8.testExtends.testConstruct;

public class Zi extends Fu {

    /*
    * 1、this()和super()必须放在构造方法代码块中的第一行，且不能通过互相调用构成循环
    * 2、java中，子类构造函数第一行默认调用父类无参构造super();
    * 3、this()和super()不能同时使用
    * */
    int age;
    String name;
    public Zi(){
        super();
        //super("张三",14);
    }

    public Zi(String name){
        this(14);
        this.name = name;
    }

    public Zi(int age){
        this.age = age;
    }

    //alt + insert
    @Override
    public void show() {
        super.show();
    }

    public void methodA(){
        this.methodB();

    }

    private void methodB() {
        System.out.println(name);
    }
}

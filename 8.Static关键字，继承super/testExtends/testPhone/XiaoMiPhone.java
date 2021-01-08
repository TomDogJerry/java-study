package com.hqyj.cl.day8.testExtends.testPhone;

/*
* 子类
* */
public class XiaoMiPhone extends Phone{

    @Override
    public void method() {

        brand = "小米手机";
        System.out.print(brand + "上网看电影,打游戏,");
        super.method();
    }
}

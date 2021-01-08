package com.hqyj.cl.day8.testExtends.testPhone;
/*
* 子类
*
* */
public class HuaWeiPhone extends Phone{

    @Override
    public void method(){
        brand = "华为手机";
        System.out.print(brand + "来电显示,头像显示,");
        super.method();
    }
}

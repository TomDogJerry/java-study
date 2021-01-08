package com.hqyj.cl.day10.testInnerClass;

//定义一个外部类
public class OuterClass01 {
    private int i = 1;

    //定义一个成员内部类
    public class InnerClass01{
        private int i = 2;
        //方法，用来输出内容
        public void isJump(){
            //当内部类和外部类变量重名时，通过外部类名.this.变量名访问外部类变量
            System.out.println(OuterClass01.this.i);
            System.out.println(i);

        }
    }


}

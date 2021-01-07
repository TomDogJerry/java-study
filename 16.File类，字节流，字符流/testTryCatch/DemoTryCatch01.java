package com.hqyj.cl.day14.testTryCatch;

import java.io.FileNotFoundException;

/*
*     try{
        可能产生异常的代码
    }catch(定义一个异常的变量,用来接收try中抛出的异常对象){
        异常的处理逻辑,异常异常对象之后,怎么处理异常对象
        一般在工作中,会把异常的信息记录到一个日志中
    }
    ...
    catch(异常类名 变量名){

    }
*
* */
public class DemoTryCatch01 {

    public static void main(String[] args) {
        int[] arr = null;
        try {
            int i = methodA("a.txt");
            int j = methodB(arr);
            System.out.println(i);
            System.out.println(j);
        } catch (FileNotFoundException e) {
            System.out.println("文件的后缀名不相符合");
        }catch (NullPointerException n){
            System.out.println("空指针异常");
        }
        System.out.println("最后的内容");

        //try不能单独使用
//        try{
//            System.out.println(1);
//        }

        //catch也不能单独使用，只能和try连用
//        catch (Exception e){
//
//        }

//        try {
//            int i = methodB(arr);
//            System.out.println(i);
//        }catch (NullPointerException n){
//            System.out.println("空指针异常");
//        }

    }

    public static int methodA(String path) throws FileNotFoundException {

        if (!path.endsWith(".txt")){
            throw new FileNotFoundException("文件后缀名不对");
        }

        return 1;
    }

    public static int methodB(int[] arr){
        if (arr == null){
            throw new NullPointerException("空指针异常");
        }
        return 1;
    }
}

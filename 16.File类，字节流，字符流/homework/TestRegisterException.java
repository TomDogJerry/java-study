package com.hqyj.cl.day14.homework;

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TestRegisterException {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        Collections.addAll(set,"张三","李四","王五");
        System.out.println("请输入用户名：");
        String addName = new Scanner(System.in).next();
        for (String s : set) {
            if (s.equals(addName)){
                try {
                    throw new RegisterException("用户已经注册了");
                } catch (RegisterException e) {
                    e.printStackTrace();
                    return;
                }
            }
        }
        set.add(addName);
        System.out.println("注册成功");
    }
}

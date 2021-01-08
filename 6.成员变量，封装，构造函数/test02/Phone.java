package com.hqyj.cl.day6.test02;

public class Phone {
    private String name;
    private int price;
    private int number;

    public Phone(){

    }

    public Phone(String name,int price){
        this.name = name;
        this.price = price;
    }

    public Phone(String name,int price,int number){
        this.name = name;
        this.price = price;
        this.number = number;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setPrice(int price){
        this.price = price;
    }
    public int getPrice(){
        return price;
    }

    public void setNumber(int number){
        this.number = number;
    }

    public int getNumber(){
        return number;
    }
}

package com.staticvsinstance;

public class StaticVsInstance {

    public static void main(String[] args) {
        StaticVsInstance staticVsInstance=new StaticVsInstance();
        staticVsInstance.add();
    }

    public void add(){
        System.out.println("Adding two numbers..!!!");
    }
}

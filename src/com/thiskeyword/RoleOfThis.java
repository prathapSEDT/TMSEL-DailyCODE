package com.thiskeyword;

public class RoleOfThis {
    int a=10;// global variables
    int b=40;

    public static void main(String[] args) {
        RoleOfThis roleOfThis=new RoleOfThis();
        roleOfThis.add(56,56);
    }

    public  void add(int a, int b){
        // a,b are called as local variables
        System.out.println(a+b);
        System.out.println(this.a+this.b);
    }
}

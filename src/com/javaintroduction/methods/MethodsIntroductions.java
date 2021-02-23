package com.javaintroduction.methods;

public class MethodsIntroductions {
    // class area
    static int result;
    public static void add(int a,int b){

         result=a+b;

    }

    public static void main(String[] args) {
        add(10,30);
        System.out.println(result);
        add(30,40);
        System.out.println(result);
        add(40,40);
        System.out.println(result);

    }
}

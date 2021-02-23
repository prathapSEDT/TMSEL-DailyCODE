package com.javaintroduction;

public class TaskOnVariables {
    public static void main(String[] args) {
        int a,b;
        a=30;
        b=40;
        // swap two numbers, a==> 40 b==>30
        a=a+b;// 70
        b=a-b;//70-40=30
        a=a-b;//70-30=40

        System.out.println(a+" "+b);

    }
}

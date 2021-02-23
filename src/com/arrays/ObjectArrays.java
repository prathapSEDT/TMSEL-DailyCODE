package com.arrays;

public class ObjectArrays {
    public static void main(String[] args) {
        Object[] arr=new Object[5];
        arr[0]=234;
        arr[1]="Rahul";
        arr[2]="Ramesh";
        arr[3]=true;
        for (Object name:arr) {
            System.out.println(name);
        }
    }
}

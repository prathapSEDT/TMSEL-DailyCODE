package com.strings;

public class Trim {
    public static void main(String[] args) {
        String str="        india       ";
        System.out.println("The length before trim is : "+str.length());

        str=str.trim();
        System.out.println("The length after trim is : "+str.length());

    }
}

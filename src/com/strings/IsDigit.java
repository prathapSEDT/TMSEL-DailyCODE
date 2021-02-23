package com.strings;

public class IsDigit {
    public static void main(String[] args) {
        String str="my transaction id : 1098";
        String temp="";
        char[] arr=str.toCharArray();
        for (char c:arr) {
            if(Character.isDigit(c)){
                temp=temp+c;
            }
        }
        System.out.println(temp);
    }
}

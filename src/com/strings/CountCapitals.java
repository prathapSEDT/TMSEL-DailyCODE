package com.strings;

public class CountCapitals {
    public static void main(String[] args) {
        String str="IndiA America";
        int count=0;
        char[] arr=str.toCharArray();
        for (char c:arr) {
            if(Character.isUpperCase(c)){
                count++;
            }
        }
        System.out.println(count);
    }
}

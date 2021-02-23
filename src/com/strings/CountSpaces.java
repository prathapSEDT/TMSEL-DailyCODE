package com.strings;

public class CountSpaces {
    public static void main(String[] args) {
        String str="A B C D";
        int sum=0;
        for (char c:str.toCharArray()) {
            if(Character.isWhitespace(c)){
                sum++;
            }
        }
        System.out.println(sum);
    }
}

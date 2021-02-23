package com.strings;

public class Split {
    public static void main(String[] args) {
        String str="india;japan;china";
        String[] arr=str.split(";");
        for (String word:arr) {
            System.out.println(word);
        }
    }
}

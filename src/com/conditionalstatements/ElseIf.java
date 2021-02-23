package com.conditionalstatements;

public class ElseIf {
    public static void main(String[] args) {
        int a=1500;
        int b=7000;
        if(a>b){
            System.out.println("A is greater than B");
        }else if (a>=1000 && a<=1500){
            System.out.println("A is less than B, but it is in the range of 1000 and 1500");
        }else
        {
            System.out.println("A is not greater than B , also not in the range of 1000 and 1500");
        }
    }
}

package com.constructors;

public class GetVal {
    int sum=0;

    GetVal(int a, int b){
        this.sum=a+b;
    }

    public void displayResult(){
        System.out.println(this.sum);
    }

    public static void main(String[] args) {
        GetVal getVal=new GetVal(10,30);
        getVal.displayResult();
    }
}

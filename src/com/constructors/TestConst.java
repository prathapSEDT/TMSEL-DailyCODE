package com.constructors;

public class TestConst {
    TestConst(){
        System.out.println("constructor triggered");
    }
    TestConst(int a){
        this();
        System.out.println("one arg param const");
    }
    TestConst(int a,int b){
        this(a);
        System.out.println("two arg param const");

    }
   public static void main(String[] args) {
TestConst testConst=new TestConst(9,90);

    }
}

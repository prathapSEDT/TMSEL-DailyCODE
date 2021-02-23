package com.oops.interfacess;

public class TestAnnn {
    public static void main(String[] args) {
        FuncInter funcInter=new FuncInter() {
            @Override
            public void testAdd() {
                System.out.println("testing");
            }
        };
        funcInter.testAdd();
        funcInter.check();
        FuncInter.dTest();
    }
}

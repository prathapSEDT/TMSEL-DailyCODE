package com.oops.interfacess;

public interface FuncInter {
    void testAdd();

    static void dTest(){
        System.out.println("From interace");
    }

    default  void check(){
        System.out.println("from interface default method");
    }

}

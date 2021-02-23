package com.oops.thisvssuper;



public class ChildC extends ParentA {
    int a=10;
    int b=70;
    int c=89;
    public void add(){
        System.out.println(super.a+this.b);
    }
    public static void main(String[] args) {
        ChildC c=new ChildC();
        c.add();
    }
}

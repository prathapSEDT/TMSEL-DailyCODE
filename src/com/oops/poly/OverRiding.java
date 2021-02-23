package com.oops.poly;

public class OverRiding extends Parent{
    /*
    different class
    inheritance exist
    same method name
    should not be static
    param must be same
    rteurn type should be same, or it it can be of a subtype
    access specifier, lower to higher is not possible
     */
@Override
    public Integer testOverRide(){
        System.out.println("Testing overide from child class");
        return 0;
    }

    public void add(){

    }



    public static void main(String[] args) {
        // behavioir of an object
//parent p=new child();
        // we are reffering to the parent , but creating object to the child
        Parent p=new OverRiding();
        p.testOverRide();
    }



}

package com.staticvsinstance;

public class TestStatic {
     int id=1;

    public void addStudent(String name,String std){
        System.out.println("Name : "+name+" Standard as : "+std+" id as : "+id);
        id=id+1;
    }
}

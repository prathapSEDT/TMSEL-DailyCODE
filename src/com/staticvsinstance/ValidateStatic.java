package com.staticvsinstance;

public class ValidateStatic {
    public static void main(String[] args) {
        TestStatic testStatic=new TestStatic();
        testStatic.addStudent("Prathap","9th");


        TestStatic testStatic1=new TestStatic();
        testStatic1.addStudent("Rahul","8th");

        TestStatic testStatic2=new TestStatic();
        testStatic2.addStudent("Krish","7th");
    }
}

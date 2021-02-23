package com.oops.encaps;

public class TestEncap {
    public static void main(String[] args) {


        //synatx to craete an arry
        //datatype[] var=new Datatype[size]
Employee[] employees=new Employee[5];
for(int i=0;i<=4;i++){
    //get data from eacg col per row and pass into constructor
    employees[i]=new Employee("User"+i,"Place"+i,i*5);
}

        for (Employee emp:employees) {
            System.out.println(emp.getName());
            System.out.println(emp.getPlace());
            System.out.println(emp.getSal());
            System.out.println("------------------");
        }






    }
}

package com.collectionobjects;

import com.oops.encaps.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List_Test {
    public static void main(String[] args) {
        List<EmployeeSort> values = new ArrayList<EmployeeSort>();

        values.add(
                new EmployeeSort("User01",12,789)
        );

        values.add(
                new EmployeeSort("User02",98,100)
        );
        values.add(
                new EmployeeSort("User03",65,777)
        );
        values.add(
                new EmployeeSort("User04",31,666)
        );
        values.add(
                new EmployeeSort("User05",21,555)
        );
        values.add(
                new EmployeeSort("User06",5,111)
        );

        //claa the sort method

        Collections.sort(values);

        System.out.println(values);



    }
}

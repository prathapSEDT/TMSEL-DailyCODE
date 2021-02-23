package com.oops.encaps;

public class Employee {
    private String name;
    private String place;
    private int sal;

    public Employee(String name, String place, int sal) {
        this.name = name;
        this.place = place;
        this.sal = sal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", place='" + place + '\'' +
                ", sal=" + sal +
                '}';
    }
}

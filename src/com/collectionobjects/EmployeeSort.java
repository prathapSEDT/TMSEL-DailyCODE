package com.collectionobjects;

public class EmployeeSort  implements Comparable<EmployeeSort>{
    private String name;
    private int age;
    private int sal;

    public EmployeeSort(String name, int age, int sal) {
        this.name = name;
        this.age = age;
        this.sal = sal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "EmployeeSort{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sal=" + sal +
                '}';
    }

    @Override
    public int compareTo(EmployeeSort e) {
        return this.sal-e.sal;
    }
}

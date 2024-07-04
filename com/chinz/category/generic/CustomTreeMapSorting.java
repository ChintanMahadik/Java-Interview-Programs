package com.chinz.category.generic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

class Employee implements Comparable<Employee>{
    int age;
    String designation;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Employee(int age, String designation) {
        this.age = age;
        this.designation = designation;
    }

    @Override
    public int compareTo(Employee o) {
        int index=0,index2=0;
        if (Objects.equals(o.getDesignation(), "B"))
            index=3;
        else if (Objects.equals(o.getDesignation(), "A"))
            index= 2;
        else if (Objects.equals(o.getDesignation(), "C"))
            index= 1;

        if (Objects.equals(this.getDesignation(), "B"))
            index2=3;
        else if (Objects.equals(this.getDesignation(), "A"))
            index2= 2;
        else if (Objects.equals(this.getDesignation(), "C"))
            index2= 1;


        return index2-index;
    }
}

public class CustomTreeMapSorting {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1,"A"));
        employeeList.add(new Employee(2,"B"));
        employeeList.add(new Employee(3,"C"));

        Collections.sort(employeeList);

        employeeList.stream().forEach(employee -> System.out.println(employee.getAge() + ":" + employee.getDesignation()));
    }
}

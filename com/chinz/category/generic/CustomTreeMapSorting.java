package com.chinz.category.generic;

import java.util.*;

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
        List<String> list = Arrays.asList("A", "B", "C");
        int index1 = list.indexOf(this.designation);
        int index2 = list.indexOf(o.designation);



        return index1-index2;
    }
}

public class CustomTreeMapSorting {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1,"B"));
        employeeList.add(new Employee(2,"A"));
        employeeList.add(new Employee(3,"C"));

        Collections.sort(employeeList);

        employeeList.stream().forEach(employee -> System.out.println(employee.getAge() + ":" + employee.getDesignation()));
    }
}

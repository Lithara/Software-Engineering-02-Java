package org.example;

public class Employee {
    String name;
    int age;
    String department;

    public Employee(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    public Employee() {
        this.name = "Employee";
        this.age = 25;
        this.department = "IT";
    }

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;

    }
}

package org.example;

public class Employee {
    String name;
    int age;
    static String department;

    public Employee() {

    }

    public void show() {
        System.out.println(name + " " + age + " " + department);
    }
}

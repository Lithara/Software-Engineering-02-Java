package org.example;

public class Employee {
    String name;
    int age;
    static String department;

    static {
        department = "IT";
        System.out.println("in static block");
    }

    public Employee() {
        System.out.println("in constructor");
    }

    public void show() {
        System.out.println(name + " " + age + " " + department);
    }
}

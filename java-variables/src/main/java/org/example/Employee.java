package org.example;

public class Employee {
    String name;
    int age;
    final String Department = "Maintenance";

    public void ageFinder() {
        String a = "Adult";
        String c = "Child";

        if (age>18) {
            System.out.println(name + " => " + a);
        } else {
            System.out.println(name + " => " + c);
        }
    }
}

package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Employee objEmployee1 = new Employee("Lithara", 21, "IT");
        Employee objEmployee2 = new Employee("Wasath", 21);
        Employee objEmployee3 = new Employee("Thakshika");

        System.out.println(objEmployee1.name + " " + objEmployee1.age + " " + objEmployee1.department);
        System.out.println(objEmployee2.name + " " + objEmployee2.age + " " + objEmployee2.department);
        System.out.println(objEmployee3.name + " " + objEmployee3.age + " " + objEmployee3.department);
    }
}
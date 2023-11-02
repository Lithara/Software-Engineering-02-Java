package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Employee objEmployee1 = new Employee();
        System.out.println(objEmployee1.age + " " + objEmployee1.name + " " + objEmployee1.department);

        Employee objEmployee2 = new Employee("Nimal", 12, "Maintenance");
        System.out.println(objEmployee2.age + " " + objEmployee2.name + " " + objEmployee2.department);
    }
}
package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Employee objEmployee1 = new Employee();
        Employee objEmployee2 =  new Employee();

        objEmployee1.name = "Lithara";
        objEmployee1.age = 21;
        Employee.department = "IT";

        objEmployee2.name = "Dihansa";
        objEmployee2.age = 20;
        Employee.department = "Maintenance";

        objEmployee1.show();
        objEmployee2.show();
    }
}

//5:30
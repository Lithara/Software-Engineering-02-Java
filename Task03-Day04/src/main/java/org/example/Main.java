package org.example;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Get the radius from the user
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // Create an instance of EncapData
        EncapData data = new EncapData(radius);

        // Calculate and display the circumference
        double circumference = data.calculateCircumference();

        System.out.println("Circumference of the circle: " + circumference);

        scanner.close();
    }
}
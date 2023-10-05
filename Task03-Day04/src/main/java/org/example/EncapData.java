package org.example;

public class EncapData {
    private double radius;
    private double pi;

    // Constructor to initialize the values
    public EncapData(double radius) {
        this.radius = radius;
        this.pi = 3.14; // Assigning pi as 3.14
    }

    // Getter method for radius
    public double getRadius() {
        return radius;
    }

    // Setter method for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Calculate and return the circumference of the circle
    public double calculateCircumference() {
        return 2 * pi * radius;
    }
}

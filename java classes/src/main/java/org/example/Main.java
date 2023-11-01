package org.example;

public class Main {
    public static void main(String[] args) {

        Car objCar = new Car();

        objCar.color = "red";
        objCar.name = "Toyota";
        objCar.speed = 150;
        objCar.weight = 45.5;
        objCar.no = 123;

        objCar.speed();
        objCar.color();
    }
}
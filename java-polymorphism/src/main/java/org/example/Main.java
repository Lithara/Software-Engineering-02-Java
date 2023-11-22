package org.example;

class Bike{
    void run(){
        System.out.println("bike is running");
    }
}

class yamaha extends Bike{
    void run(){
        System.out.println("Yamaha bike is running");
    }
}

public class Main {
    public static void main(String[] args) {
        Bike objBike = new yamaha();
        objBike.run();
    }
}
package org.example;

public class Dog implements Animal, Animal1{

    @Override
    public void sleep() {
        System.out.println("Dog sleeps");
    }

    @Override
    public void run() {
    }

    @Override
    public void eat() {
        System.out.println("Dog eats");
    }
}

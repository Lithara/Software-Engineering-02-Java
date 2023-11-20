package org.example;

public class Samsung extends Phone{

    @Override
    public void call() {
        System.out.println("Inside samsung call");
    }

    @Override
    public void sleep() {
        System.out.println("Inside samsung sleep");
    }
}

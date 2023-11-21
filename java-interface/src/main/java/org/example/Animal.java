package org.example;

public interface Animal {
    void sleep();
    void eat();

    default void newmethod(){
        System.out.println("in default method");
    }
}

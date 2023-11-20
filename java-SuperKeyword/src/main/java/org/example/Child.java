package org.example;

public class Child extends Parent{

    public Child(){
        super();
        System.out.println("inside the default constructor of child class");
    }

    public Child(int a){
        super(a);
        System.out.println("inside the parameterized constructor of child class");
    }
}

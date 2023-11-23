package org.example;

/*class Bike{
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
}*/

class Animal{
    void eat(){
        System.out.println("eating");
    }
}

class Dog extends Animal{
    void eat(){
        System.out.println("Dog is running");
    }
}

class BabyDog extends Dog{
    void eat(){
        System.out.println("Baby dog is running");
    }
}

public class Main {
    public static void main(String[] args) {

        /*Animal objAnimal1, objAnimal2, objAnimal3;

        objAnimal1 = new Animal();
        objAnimal1.eat();

        objAnimal2 = new Dog();
        objAnimal2.eat();

        objAnimal3 = new BabyDog();
        objAnimal3.eat();*/

        Animal objAnimal1 = new Animal();
        objAnimal1.eat();

        Animal objAnimal2 = new Dog();
        objAnimal2.eat();

        Animal objAnimal3 = new BabyDog();
        objAnimal3.eat();
    }
}
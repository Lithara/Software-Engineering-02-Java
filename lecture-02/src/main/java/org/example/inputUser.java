package org.example;

import java.util.Scanner;

public class inputUser {

    public void eligibility(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.next();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("eligible");
        } else {
            System.out.println("not eligible");
        }
    }
}
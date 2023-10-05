// Create a Java application to check whether the user is eligible for voting once user’s age passed as parameter to the separate class. Display the output inside the separate class.

import java.util.Scanner;

public class eligibility {
    public static void main(String[] args) {
        
        eligibility objEligibility = new eligibility();

        objEligibility.inputUserDetails();
    }
    
    public void inputUserDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.next();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println(name + " is eligible to vote");
        } else {
            System.out.println(name + " is not eligible to vote");
        }
    }
}

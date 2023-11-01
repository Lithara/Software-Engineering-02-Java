// Create a Java project which takes user’s name and the degree inside a separate class and displays the output within the same class.

import java.util.Scanner;

public class separate {
    public static void main(String[] args) {
        System.out.println("User Details:");

        separate userDetails = new separate();

        userDetails.inputUserDetails();
    }
    
    public void inputUserDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.next();

        System.out.print("Enter your degree: ");
        String degree = scanner.next();

        System.out.println(name + " " + degree);
    }
}

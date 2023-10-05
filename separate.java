// Create a Java project which takes user’s name and the degree inside a separate class and displays the output within the same class.

import java.util.Scanner;

public class separate {
    private String name;
    private String degree;

    public static void main(String[] args) {
        separate userDetails = new separate();
        userDetails.inputUserDetails();
        userDetails.displayUserDetails();
    }
    
    public void inputUserDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        this.name = scanner.nextLine();

        System.out.print("Enter your degree: ");
        this.degree = scanner.nextLine();
    }

    public void displayUserDetails() {
        System.out.println("User Details:");
        System.out.println("Name: " + name);
        System.out.println("Degree: " + degree);
    }
}

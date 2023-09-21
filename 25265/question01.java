import java.util.Scanner;

public class question01 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");

        String name = input.nextLine();
        System.out.println("Enter your age: ");
        
        int age = input.nextInt();
        
        if (age >= 18) {
            System.out.println(name + " is capable of voting.");
        } else {
            System.out.println(name + " is not capable of voting.");
        }
    }
}
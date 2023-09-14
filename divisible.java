import java.util.Scanner;

public class divisible {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num1 = input.nextInt();

        System.out.println("Enter another number: ");
        int num2 = input.nextInt();

        if (num1 % num2 == 0) {
            System.out.println("Number 1 is divisible by number 2");
        } else {
            System.out.println("Number 1 is not divisible by number 2");
        }
        
    }
}

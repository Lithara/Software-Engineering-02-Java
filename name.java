import java.util.Scanner;

public class name {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first name: ");
        String fName = scan.nextLine();

        System.out.println("Enter the last name: ");
        String lName = scan.nextLine();

        System.out.println(fName + " " + lName);
    }
}
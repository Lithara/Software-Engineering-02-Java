import java.util.Scanner;

public class character {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first name: ");
        String word = scan.nextLine();

        System.out.println(word.length());
    }
}
import java.util.Scanner;

public class findMax {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] intArray = new int[10];
        int max = 0;

        for (int i=0; i<10; i++) {
            System.out.println("Enter a number: ");
            intArray[i] = input.nextInt();

            if (intArray[i] > max) {
                max = intArray[i];
            }
        }

        System.out.println("The max number is: " + max);
    }
}
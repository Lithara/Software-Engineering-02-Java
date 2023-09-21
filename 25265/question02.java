import java.util.Scanner;

public class question02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the arrays: ");
        int length = scanner.nextInt();

        int[] array1 = new int[length];
        int[] array2 = new int[length];

        System.out.println("Enter elements for the first array:");
        for (int i = 0; i < length; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array1[i] = scanner.nextInt();
        }

        System.out.println("Enter elements for the second array:");
        for (int i = 0; i < length; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array2[i] = scanner.nextInt();
        }

        int scalarProduct = calculateScalarProduct(array1, array2);

        System.out.println("The scalar product of the two arrays is: " + scalarProduct);

        scanner.close();
    }

    public static int calculateScalarProduct(int[] array1, int[] array2) {
        int result = 0;
        for (int i = 0; i < array1.length; i++) {
            result += array1[i] * array2[i];
        }
        return result;
    }
}

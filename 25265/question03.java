import java.util.Scanner;

public class question03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = 5;

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

        int[] combinedArray = combineArrays(array1, array2);

        int minArray1 = findMin(array1);
        int maxArray1 = findMax(array1);
        int minArray2 = findMin(array2);
        int maxArray2 = findMax(array2);

        System.out.println("Combined Array:");
        for (int value : combinedArray) {
            System.out.print(value + " ");
        }

        System.out.println("\nMinimum value in Array 1: " + minArray1);
        System.out.println("Maximum value in Array 1: " + maxArray1);
        System.out.println("Minimum value in Array 2: " + minArray2);
        System.out.println("Maximum value in Array 2: " + maxArray2);

        scanner.close();
    }

    public static int[] combineArrays(int[] array1, int[] array2) {
        int combinedLength = array1.length + array2.length;
        int[] combinedArray = new int[combinedLength];

        for (int i = 0; i < array1.length; i++) {
            combinedArray[i] = array1[i];
        }

        for (int i = 0; i < array2.length; i++) {
            combinedArray[array1.length + i] = array2[i];
        }

        return combinedArray;
    }

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}



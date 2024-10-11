import java.util.Arrays;
import java.util.Scanner;

public class Insertion {

    // Method to perform insertion 
    public static void insertion(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int l = i - 1;

            while (l >= 0 && arr[l] > key) {
                arr[l + 1] = arr[l];
                l = l - 1;
            }
            arr[l + 1] = key;
        }
    }

    // Method to print the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Main method to test the insertion 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for array size
        System.out.print("Enter the number of Elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        // Ask user for array elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Sort the array
        insertion(arr);

        // Print the sorted array
        System.out.println("Sorted array:");
        printArray(arr);

        scanner.close();
    }
}
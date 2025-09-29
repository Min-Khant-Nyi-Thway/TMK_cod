package array;

import java.util.Scanner;

public class reverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the number of elements to store in the array :");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Input " + n + " number of elements in the array :");
        for (int i = 0; i < n; i++) {
            System.out.print("element - " + i + " : ");
            arr[i] = scanner.nextInt();
        }

        System.out.println("\nThe values store into the array in reverse are :");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); 
        scanner.close();
    }
}

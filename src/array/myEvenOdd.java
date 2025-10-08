package array;
import java.util.Scanner;

public class myEvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input the number of elements
        System.out.print("Enter Array Size: ");
        int num = scanner.nextInt();
        
        // Create array
        int[] arr = new int[num];
        
        // Input elements
        for (int i = 0; i < num; i++) {
            System.out.print("element: " + i);
            arr[i] = scanner.nextInt();
        }
        
        // Count even and odd numbers
        int evenCount = 0;
        int oddCount = 0;
        
        for (int i = 0; i < num; i++) {
            if (arr[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        
        // Create arrays for even and odd numbers
        int[] evenArr = new int[evenCount];
        int[] oddArr = new int[oddCount];
        
        int evenIndex = 0;
        int oddIndex = 0;
        
        // even and odd numbers
        for (int i = 0; i < num; i++) {
            if (arr[i] % 2 == 0) {
                evenArr[evenIndex++] = arr[i];
            } else {
                oddArr[oddIndex++] = arr[i];
            }
        }
        
        // Display results
        System.out.println("\nThe Even elements are:");
        for (int i = 0; i < evenArr.length; i++) {
            System.out.print(evenArr[i] + " ");
        }
        
        System.out.println("\n\nThe Odd elements are:");
        for (int i = 0; i < oddArr.length; i++) {
            System.out.print(oddArr[i] + " ");
        }
    }
}
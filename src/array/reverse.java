package array;

import java.util.Scanner;

public class reverse {
        
 public static void reverseArray(int[] arr) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("The Value store in the array in reverse are");
        
        int start = scan.nextInt();
        int end = arr.length - 1;

        while (start < end) {
            
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Array Size: ");
            int size = scan.nextInt();
            int myArray[] = new int[size]; //{0,...}
        
        System.out.println("Input " + size + " element in the array");
        
        for (int num : myArray) {
            // System.out.print(num + " ");
        }
          System.out.println("Input " + size + " element in the array");

        reverseArray(myArray);

        // System.out.println("Reversed Array:");
        for (int num : myArray) {
            System.out.print(num + " ");
        }
        System.out.println();

    }
}
// ---------------- Not done yet
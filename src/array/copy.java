package array;

import java.util.Scanner;

public class copy {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter array's size");
        int size = scan.nextInt();

        int first[] = new int[size];
        int second[] = new int[size];

        //input for the first array
        for (int i = 0; i < size; i++) {
            System.out.println("Enter element: " + i);
            first[i] = scan.nextInt();// {0,0,0,0} // if i=15, then {15,0,0,0}
        }

        //output the first array
        System.out.println("The elements stored in the first array are: ");
        for (int i = 0; i < size; i++) {
            System.out.print(first[i] + " ");
        }

        //copy and output for the second array
        System.out.println("\nThe elements copied into the second array are: ");
        for (int i = 0; i < size; i++) {
            second[i] = first[i];
            System.out.print(second[i] + " ");
        }

    }
}

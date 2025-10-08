package array;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Array Size: ");
        int size = scan.nextInt();
        int num[] = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter element :" + i);
            num[i] = scan.nextInt();
        }

        System.out.println("The Even number: ");
        for (int i = 0; i < size; i++) {
            if (num[i]%2 == 0) {
                System.out.println(num[i]+ " ");
            }            
        }

        System.out.println("The Odd number: ");
        for (int i = 0; i < size; i++) {
            if (num[i]%2 != 0) {
                System.out.println(num[i]+ " ");
            }            
        }
    }
}

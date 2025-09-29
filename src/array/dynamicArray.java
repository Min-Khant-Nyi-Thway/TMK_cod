package array;

import java.util.Scanner;

public class dynamicArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Array Size: ");
            int size = scan.nextInt();
            int num[] = new int[size]; //{0,...}
        
        System.out.println("Input " + size + " element in the array");

        //array input
        for (int i = 0; i < size; i++) {// i = 0,2,3
            System.out.println("Element for - "+ i + ":");
            num[i] = scan.nextInt(); //{0,0,0,0} => {2,9,10,12}
        }

        //array output
        for (int i = 0; i < size; i++) {
            System.out.println(num[i] + "\t");
        }
    }
}

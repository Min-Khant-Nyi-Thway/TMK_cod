package array;

import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter array's size:");

        int size = scan.nextInt();
        int num[] = new int[size];

        //input array
        for (int i = 0; i < size; i++) {
            System.out.println("Enter element:" + i);
            num[i] = scan.nextInt(); //{20,9,17,40,10}
        }

        //find maximum
        int max = num[0]; //20
        for (int i = 0; i < size; i++) {
            if (num[i] > max) {
                max = num[i];
            }
        }
        System.out.println("Maxium number is " + max);
    }
}

package array;

import java.util.Scanner;

public class SecMaximum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter array's size:");

        int size = scan.nextInt();
        int num[] = new int[size];

        //input array
        for (int i = 0; i < size; i++) {
            System.out.println("Enter element:" + i);
            num[i] = scan.nextInt(); //{10,9,17,11,20}
        }

        //find second maximum
        int max1 = num[0]; //10
        int max2 = -1; 
        // for (int i = 1; i < size; i++) { // also correct
        for (int i = 0; i < size; i++) { 
            if (num[i] > max1) {
                max2 = max1; //10,17
                max1 = num[i]; //17,20
            }
            else if (num[i] > max2)
                max2 = num[i]; //10,11
        }
        System.out.println("Second Maxium number is " + max2);
    }
}

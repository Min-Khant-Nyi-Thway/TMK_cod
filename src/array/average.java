package array;

import java.util.Scanner;

public class average {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter array Size");

        int size = scan.nextInt(); //4
        int num[] = new int[size]; //{0,0,0,0}

        //input array
        for (int i = 0; i < size; i++) {
            System.out.println("Enter element: " + i);
            num[i] = scan.nextInt();
        }

        //find sum
        int sum = 0;
        for (int i = 0; i < size; i++) { //{21,38,56,59}
           sum = sum + num[i];  
        }
        double avg = (double)sum/size;
        System.out.println("Average: "+ avg);

    }

}

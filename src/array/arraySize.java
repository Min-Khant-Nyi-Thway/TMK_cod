package array;

import java.util.Scanner;

public class arraySize {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int num[] = new int[5];

        //array input
        for (int i = 0; i < num.length; i++) {
            System.out.println("Element index: " + i);
            num[i] = scan.nextInt(); //{5,7,12,18,20}
        }

        //array output
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]+ "\t");
        }

    }
}

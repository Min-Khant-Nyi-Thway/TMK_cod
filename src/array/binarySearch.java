package array;

import java.util.Arrays;
import java.util.Scanner;

public class binarySearch {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = scan.nextInt();
        int num[] = new int[size]; //{0,0,0,0,0}

        //input array
        for (int i = 0; i < size; i++) {
            System.out.println("Enter Element: " + i);
            num[i] = scan.nextInt(); //user input {5 times}
        }

        System.out.println("Enter target number: ");
        int target = scan.nextInt();

        Arrays.sort(num); //{9,15,48,150,200}

        //find target number
        int index = -1;
        boolean found = false;

        int low = 0, high = size -1, mid = -1;
        while (low<=high) {
            
            mid = (low + high)/2 ; //2,0,1
            if (target < num[mid]) 
                high = mid - 1;
                else if (target > num[mid]) 
                low = mid + 1;
                else {
                    found = true;
                    index = mid;
                    break;
                }
        }

        if (found) {
            System.out.println(target + " is found at index:" + index);
        } else
        System.out.println(target + " is not found");
    }

}

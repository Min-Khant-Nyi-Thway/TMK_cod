package array;

import java.util.Scanner;

public class LinerSearch {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter array size:");
        int size = scan.nextInt(); //5

        scan.nextLine();

        String name[] = new String[size];
        // scan.nextInt();
        
        //input array
        for (int i = 0; i < size; i++) {
            System.out.println("Element:" + i);
            name[i] = scan.nextLine();
        }

        System.out.println("Enter search name:");
        String search_name = scan.nextLine(); // Aung Aung

        //find search name
        // array start from zero so -1 is slowest pointer that doesn't exist in array
        int index = -1;
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (name[i].equals(search_name)) {
                found = true;
                index = i; //2
                break;
            }
        }

        if (found) {
            System.out.println(search_name + " is found at index " + index);
        } else 
        System.out.println(search_name + " is not found");
    }
}

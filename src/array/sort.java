package array;

import java.util.Scanner;
import java.util.Arrays;

public class sort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter array's size:");
        int size = scan.nextInt(); //3

        String name[] = new String[size]; //{null}

        //Element:0 and Element:1 output conflict
        scan.nextLine();

        // for (int i = 0; i < size; i++) {
        //     System.out.println(name[i]); //{null,null,null}
        // }  

        for (int i = 0; i < size; i++) {
            System.out.println("Element:" + i);
            name[i] = scan.nextLine(); 
            // if size is 3,
            //first loop {Aye Aye,null,null,null,null}
            //second loop {Aye Aye,Su Su,null,null,null}
            //third loop {Aye Aye,Su Su,Mg Mg,null,null}
        }

        //sort method is acending as default.
        Arrays.sort(name);

        //output array
        // arrays method is static method so you can call or use their class name directly.
        // if they are not static (non-static) you have to create before the object class and then use it.
        System.out.println("After sort:");
        for (int i = 0; i < size ; i++) {
            System.out.println(name[i]);
        }
    }
}

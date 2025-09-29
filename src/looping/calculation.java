package looping;

import java.util.Scanner;

public class calculation {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String confirm = ""; //empty string //null

        do {
            System.out.println("Enter Number num1: ");
            int num1 = scan.nextInt();
            System.out.println("Enter Number num2: ");
            int num2 = scan.nextInt();
            System.out.println("Sum:" + (num1+num2));

            System.out.println("Do you want to  continuous? yes or no?");
        } while (confirm.equals("yes"));

    }
}

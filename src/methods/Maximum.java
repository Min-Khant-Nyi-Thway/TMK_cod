package methods;

import java.util.Scanner;

public class Maximum {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first number:");
        int num1 = scan.nextInt();

        System.out.println("Enter second number");
        int num2 = scan.nextInt();

        int max = findMax(num1,num2);
        System.out.println("Maximum:" + max);

    }

    public static int findMax(int x, int y) {
        
        if (x > y) 
            return x;
            return y;
        
    }

}
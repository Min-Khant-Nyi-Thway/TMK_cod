package methods;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = scan.nextInt(); // 2
        boolean result = isPrime(num); //pass by value

        if (result) 
            System.out.println(num + " is prime number");
        else
            System.out.println(num + " is not prime number");
        
    }

    public static boolean isPrime(int num) { //num = 2
        
        int div = 2;
        if(num <= 1)
            return false;
        
        while (div < num) {

        if (num % div == 0) 
            return false;
            div++;

        }
        return true;
    }
}


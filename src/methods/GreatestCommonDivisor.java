package methods;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) { //static method
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter First Number");
        int num1 = scan.nextInt();

        System.out.println("Enter Second Number");
        int num2 = scan.nextInt();

        GreatestCommonDivisor g = new GreatestCommonDivisor();
        System.out.println("GCD: "+ g.findGCD1(num1, num2));
        System.out.println("GCD: "+ g.findGCD2(num1, num2));
    }

    public int findGCD1(int n1, int n2){ // non-static method
        
        int div = 2;
        int gcd = 1;

        while (div <= n1 && div <= 2) {
            
            if(n1 % div == 0 && n2 % div == 0)
                gcd = div; //2,3,4,6,12
            div++;
        }
        return gcd;
    }

    public int findGCD2(int n1, int n2) {
        
        while (n1!=n2) {
            if(n1>n2)
                n1 = n1 - n2;
            else
             n2 = n2 - n1;
        }
        return n1;
    }
}

package methods;

import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter fisrt number");
        double num1 = scan.nextDouble();

        System.out.println("Enter Operator");
        char optr = scan.next().charAt(0);

        System.out.println("Enter second number");
        double num2 = scan.nextDouble();

        if(optr == '+')
            System.out.println("Add:" + add(num1,num2));
        else if(optr == '-')
            System.out.println("Sub:" + sub(num1,num2));
        else if(optr == '*')
            System.out.println("Mul:" + multiple(num1,num2));
        else if(optr == '/')
            System.out.println("Division:" + division(num1,num2));
        else 
            System.out.println("Invalid Operator");
    }

    public static double add(double n1, double n2){
        return n1+n2;
    }
    public static double sub(double n1, double n2){
        return n1-n2;
    }
    public static double multiple(double n1, double n2){
        return n1*n2;
    }
    public static double division(double n1, double n2){
        return n1/n2;
    }
}

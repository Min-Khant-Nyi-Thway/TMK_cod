package looping;

import java.util.Random;
import java.util.Scanner;

public class gussNumber {
    public static void main(String[] args) {
        
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        int guess_number = 0, random_number = 0, count = 0;

        do {
            System.out.println("Enter guess number: ");
            guess_number = scan.nextInt();
            random_number = random.nextInt(10)+1;
        
            System.out.println("Guess number:" + guess_number+ "\nrandom number:"+ random_number);
            count++;
        } while (guess_number != random_number);

        System.out.println("You won after "+ count + " tries!");

    }
}

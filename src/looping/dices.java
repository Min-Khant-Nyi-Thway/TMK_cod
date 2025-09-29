package looping;

import java.util.Random;

public class dices {
    public static void main(String[] args) {
        
        Random random = new Random();

        int dice1 = 0, dice2 = 0, result = 0, count = 0;
           
        do {
            dice1 = random.nextInt(6)+1;
            dice2 = random.nextInt(6)+1;

            result = dice1 + dice2;

            System.out.println(dice1 + "+" + dice2 + "=" + result);
            count++;    
        } while (result != 7);
            System.out.println("You won after " + count + " tries!");

    }
}

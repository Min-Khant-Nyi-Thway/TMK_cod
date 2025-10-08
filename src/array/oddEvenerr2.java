package array;
import java.util.Scanner;

public class oddEvenerr2 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter array's Size");
       
        int size = scan.nextInt();
        int num[] = new int[size];

        //input
        for (int i = 0; i < size; i++) {
            System.out.println("Enter element " + i);
            num[i] = scan.nextInt();
        }
        // System.out.println("Input are :" + );

        //even
        for (int i = 0; i < size; i++) {
            if (num[i] % 2 == 0) {
                System.out.println("The Even element are: " + i);
            }
            
            if (num[i] % 2 != 0) {
                System.out.println("\nThe Odd element are: " + i);
            }
            
            // System.out.println("The Even element are :" + i);
            // num[i] = scan.nextInt();
        }

        //odd
 
        // //condition
        // if (calcu / 2 == 0) {
        //     System.out.println("The Even element are :" + calcu);
        // } else if (calcu / 2 != 0) {
        //     System.out.println("The Odd element are :" + calcu);
        // }
        
        
        

        //output the even array
        // System.out.println("The element of even array are: ");

    }
}


//{25,47,56,32} => even[], odd[]
// even => /2
// else => odd
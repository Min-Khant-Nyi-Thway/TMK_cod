package array;
import java.util.ArrayList;
import java.util.Scanner;

public class EvenOdderr {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter array Size");
        int[] arr = new scan.nextInt();

        ArrayList<Integer> evenList = new ArrayList<>();
        ArrayList<Integer> oddList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenList.add(arr[i]);
            } else {
                oddList.add(arr[i]);
            }
        }

        System.out.println("The Even elements are:");
        for (int evenNum : evenList) {
            System.out.print(evenNum + " ");
        }

        System.out.println("\nThe Odd elements are:");
        for (int oddNum : oddList) {
            System.out.print(oddNum + " ");
        }
    }
}
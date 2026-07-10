package java_training_;

import java.util.Scanner;

public class SecondSmallestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        num = Math.abs(num); 

        int smallest = 10;
        int secondSmallest = 10;

        while (num > 0) {
            int digit = num % 10;

            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }

            num = num / 10;
        }

        if (secondSmallest == 10) {
            System.out.println("Second smallest digit does not exist.");
        } else {
            System.out.println("Second smallest digit = " + secondSmallest);
        }

        sc.close();
    }
}

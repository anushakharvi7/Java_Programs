package java_training_;

import java.util.Scanner;

public class CountPrimeDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        num = Math.abs(num); 
        int count = 0;

        
        if (num == 0) {
            count = 0;
        }

        while (num > 0) {
            int digit = num % 10;

            if (digit == 2 || digit == 3 || digit == 5 || digit == 7) {
                count++;
            }

            num = num / 10;
        }

        System.out.println("Number of prime digits = " + count);

        sc.close();
    }
}
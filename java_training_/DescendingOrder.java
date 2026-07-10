package java_training_;


import java.util.Scanner;
import java.util.Arrays;

public class DescendingOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        num = Math.abs(num); // Handles negative numbers

        String str = String.valueOf(num);
        char[] digits = str.toCharArray();

        // Sort in ascending order
        Arrays.sort(digits);

        // Print in reverse order (descending)
        System.out.print("Digits in descending order: ");
        for (int i = digits.length - 1; i >= 0; i--) {
            System.out.print(digits[i]);
        }

        sc.close();
    }
}
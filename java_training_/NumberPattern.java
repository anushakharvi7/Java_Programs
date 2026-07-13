package java_training_;

import java.util.Scanner;

public class NumberPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            // Print spaces
            for (int j = 1; j <= (n - i) * 2; j++) {
                System.out.print(" ");
            }

            // Print descending numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }

            // Print ascending numbers
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}
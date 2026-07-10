package java_training_;

import java.util.Scanner;

public class SecondLargestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        num = Math.abs(num); 

        int largest = -1;
        int secondLargest = -1;

        while (num > 0) {
            int digit = num % 10;

            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }

            num = num / 10;
        }

        if (secondLargest == -1) {
            System.out.println("Second largest digit does not exist.");
        } else {
            System.out.println("Second largest digit = " + secondLargest);
        }

        sc.close();
    }
}

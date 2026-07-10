package java_training_;

import java.util.Scanner;

public class KaprekarNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int square = num * num;
        String str = String.valueOf(square);

        boolean isKaprekar = false;

        for (int i = 1; i < str.length(); i++) {
            String leftPart = str.substring(0, i);
            String rightPart = str.substring(i);

            int left = Integer.parseInt(leftPart);
            int right = Integer.parseInt(rightPart);

            
            if (right != 0 && (left + right == num)) {
                isKaprekar = true;
                break;
            }
        }

        
        if (num == 1) {
            isKaprekar = true;
        }

        if (isKaprekar) {
            System.out.println(num + " is a Kaprekar Number.");
        } else {
            System.out.println(num + " is Not a Kaprekar Number.");
        }

        sc.close();
    }
}
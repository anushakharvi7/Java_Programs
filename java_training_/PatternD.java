package java_training_;

import java.util.Scanner;

public class PatternD {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("Enter the rows");
		int rows = sc.nextInt();
		System.out.println("Enter the columns");
		int cols = sc.nextInt();
		
		
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=cols;j++) {
				
				if (j == 1 || (i == 1 && j != cols) || (i == rows && j != cols) || (j == cols && i != 1 && i != rows))					System.out.print("* ");
				
				else {
					System.out.print("  ");
				}
			}
			System.out.println();

	}//				


	}
}
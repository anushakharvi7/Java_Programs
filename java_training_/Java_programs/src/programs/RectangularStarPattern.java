package programs;

import java.util.Scanner;

public class RectangularStarPattern {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("Enter the rows");
		int rows = sc.nextInt();
		System.out.println("Enter the columns");
		int cols = sc.nextInt();
		
		
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=cols;j++) {
			
			System.out.print("* ");

	}	

			System.out.println();
	}
}
}
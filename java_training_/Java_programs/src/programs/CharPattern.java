package programs;

import java.util.Scanner;

public class CharPattern {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("Enter the rows");
		int rows = sc.nextInt();
		System.out.println("Enter the columns");
		int cols = sc.nextInt();
		char c='a';
		
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=cols;j++) {
				if(c>'z')
				{
					c='a';
				}
				
			System.out.print(c+" ");
			c++;
	}				

			System.out.println();
	}
}
}

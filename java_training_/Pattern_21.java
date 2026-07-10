package java_training_;

import java.util.Scanner;

public class Pattern_21 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter number of rows");
		int rows=sc.nextInt();
//		System.out.println("enter number of columns");
//		int cols=sc.nextInt();
		
		char c ='a';

		for(int i=1;i<=rows;i++)
		{
			
			for(int j=1;j<=i;j++)
			{
				System.out.print(c+" " );
//				n++;
				
				
			}
				System.out.println();
				c++;
			

		}
	}
}
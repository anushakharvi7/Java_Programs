package java_training_;

import java.util.Scanner;

public class Pattern_20 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter number of rows");
		int rows=sc.nextInt();
//		System.out.println("enter number of columns");
//		int cols=sc.nextInt();
		for(int i=1;i<=rows;i++)
		{
//			int n =1;

			for(int j=1;j<=i;j++)
			{
				System.out.print(j );
//				n++;
				
				
			}
				System.out.println();
			

		}
	}
}
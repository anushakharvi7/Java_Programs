package java_training_;

import java.util.Scanner;

public class Pattern_14 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter number of rows");
		int rows=sc.nextInt();
		System.out.println("enter number of columns");
		int cols=sc.nextInt();
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=cols;j++)
			{
				if((i+j)==rows+1||i==j)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
				System.out.println();
			
			
		}
		}
	}

		
	
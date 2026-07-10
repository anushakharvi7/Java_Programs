package java_training_;

import java.util.Scanner;

public class Pattern_15 {

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
				//if(i==1||j==1||j==cols||i==rows/2+1)
				if((i==1&&j!=1&&j!=cols)||(j==1 && i!=1)||(j==cols&&i!=1)||i==(rows/2)+1)
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

		
	//print E and F
package java_training_;

import java.util.Scanner;

public class Pattern_26 {

	public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			System.out.println("enter number of rows");
			int rows=sc.nextInt();
//			System.out.println("enter number of columns");
//			int cols=sc.nextInt();
			int step=0;
			for(int i=1;i<=rows;i++)
			{
				int n =1;
				int m =0;
				
				for(int j=1;j<=i;j++)
				{
					step++;
					if(step%2==0)
					System.out.print("0 " );
					else
						System.out.print("1 ");
					
					
				}
					System.out.println();

			}
		}
	}
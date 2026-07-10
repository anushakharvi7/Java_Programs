package java_training_;

import java.util.Scanner;

public class Pattern_22 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter number of rows");
		int rows=sc.nextInt();
//		System.out.println("enter number of columns");
//		int cols=sc.nextInt();
		

		for(int i=1;i<=rows;i++)
		{
			int num =1;
			char c ='a';
			
			
			for(int j=1;j<=i;j++)
			{
				if(i%2==0)
				System.out.print(c++ +" " );
				else
					System.out.print(num++ +" ");
				
				
			}
				System.out.println();
				

		}
	}
}
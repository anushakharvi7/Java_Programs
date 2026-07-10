package java_training_;

import java.util.Scanner;

public class Pattern_23 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter number of rows");
		int rows=sc.nextInt();
//		System.out.println("enter number of columns");
//		int cols=sc.nextInt();
		
		for(int i=1;i<=rows;i++)
		{
			int n =1;
			int m =0;
			for(int j=1;j<=i;j++)
			{
				
				if(i%2==0)
				System.out.print(m +" " );
				else
					System.out.print(n +" ");
				
				
			}
				System.out.println();
//				if(i%2==0)
//					System.out.println(n);
//					n++;
//				else
//					System.out.println(m);
//					m++;
		}
	}
}
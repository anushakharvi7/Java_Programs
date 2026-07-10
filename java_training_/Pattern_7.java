package java_training_;

import java.util.Scanner;

public class Pattern_7 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the no of rows:");
		int rows=sc.nextInt();
		System.out.println("Enter the no of columns:");
		int cols=sc.nextInt();

		char c='a';
		int num=1;
		for(int i=1;i<=rows;i++) {
			
			for(int j=1;j<=cols;j++) {
				if(i%2==0) {
					System.out.print(c+" ");
					
				}
				else {
						System.out.print(num+" ");
						
						}
				
		}
			System.out.println();
			if(i%2==0)
				c++;
			else
				num++;
				}

	}

}
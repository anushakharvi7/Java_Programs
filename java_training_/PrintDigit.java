package java_training_;

import java.util.Scanner;

public class PrintDigit {

	public static void main(String[] args) {
		System.out.println("enter a number:");

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		while(n!=0)
		{
			int ld =n%10;
			System.out.println(ld);
			n=n/10;
		}
		//System.out.println(count);
		
			
		
	}

}

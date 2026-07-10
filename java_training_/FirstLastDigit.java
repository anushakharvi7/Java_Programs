package java_training_;

import java.util.Scanner;

public class FirstLastDigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int n=sc.nextInt();
		int last=n%10;
		while(n>9)
		{
			n/=10;
			
		}
		System.out.println(n);
		System.out.println(last);
		
		
	}

}

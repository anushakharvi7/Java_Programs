package java_training_;

import java.util.Scanner;

public class SumProductOfDigits {

	public static void main(String[] args) {
		System.out.println("enter a number:");

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=sc.nextInt();
		int sum=0;
		int prod=1;
		
			sum=n+a;
			prod=n*a;
		
		System.out.println(sum);
		System.out.println(prod);
	}

}

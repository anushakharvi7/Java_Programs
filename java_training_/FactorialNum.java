package java_training_;

import java.util.Scanner;

public class FactorialNum {

	public static void main(String[] args) {
		System.out.println("enter a number:");

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int prod =1;
		for(int i=1;i<=n;i++)
		{
			prod=prod*i;
		}
		System.out.println(prod);
	}

}

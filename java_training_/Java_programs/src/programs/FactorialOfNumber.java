package programs;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int num=sc.nextInt();
		int prod=1;
		for(int i=1;i<=num;i++)
		{
			prod=prod*i;
		}
		System.out.println(prod);
		}
	}



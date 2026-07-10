package java_training_;

import java.util.Scanner;

public class Ducknumber {

	public static void main(String[] args) {
		System.out.println("enter a number:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(n>0)
		{
			ld=n%10;
			if(ld ==0)
		{
			System.out.println("Duck Number");
			return;
		}
		n/=10;
	
		}
		System.out.println("Not a duck number");
		}
	}


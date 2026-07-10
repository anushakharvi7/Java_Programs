package java_training_;

import java.util.Scanner;

public class HappyNumber {

	public static void main(String[] args) {
		System.out.println("enter a number:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int sum=0;

		while(n!=1&&n!=4)
		{
			sum=0;
			while(n>0)
			{
				int ld=n%10;
				sum+=(ld*ld);
				n/=10;
			}
			n=sum;
		}
		if(n==1)
		{
			System.out.println("Happy number");
		}
		else
		{
			System.out.println("sad number");
		}
	}
		
	}



package java_training_;

import java.util.Scanner;

public class MagicNumber {

	public static void main(String[] args) {
		System.out.println("enter a number:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int sum=0;

		while(n!=1&&n!=10)
		{
			sum=0;
			while(n>0)
			{
				int ld=n%10;
				sum=(n*n);//remove for happy number
				n/=10;
			}
			n=sum;
		}
		if(n==1)
		{
			System.out.println("magic number");
		}
		else
		{
			System.out.println("not magic number");
		}
	}
		
	}



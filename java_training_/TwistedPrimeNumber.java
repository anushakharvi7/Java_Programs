package java_training_;

import java.util.Scanner;

public class TwistedPrimeNumber {
	
	public static boolean isPrime(int n)
	{
		int count=0;
		for (int i=1;i<=n;i++)
		{
			if(n%i==0)
				count++;
		}
		return count==2;
	}
	public static int reverse(int n)
	{
		int rev=0;
		while(n>0)
		{
			int ld=n%10;
			rev=rev*10+ld;
			n/=10;
		}
		return rev;
	}

	public static void main(String[] args) {
	
	//if number is prime reverse that number and check if the reversed number is prime number,
		//then it is a twisted prime number
		
		
		
		System.out.println("enter a number:");

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(isPrime(n))
		{
			int rev=reverse(n);
			if(isPrime(rev))
			{
				System.out.println("Twisted prime");
			}
			else
			{
				System.out.println("not twisted prime");
			}
		}
		else
		{
			System.out.println("not a prime");
		}
		
		
	}

}

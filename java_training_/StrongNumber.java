package java_training_;

import java.util.Scanner;

//Strong Number
//145-->1 , 4, 5
//1!+4!+5!
//1+24+125
//145


public class StrongNumber {
	
	public static int fact(int n)
	{
		int res=1;
		for(int i=1;i<=n;i++)
		{
			res=res*i;
		}
		return res;
	}

	public static void main(String[] args) {
		
		System.out.println("enter a number:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int temp=n;
		while(n>0)
			
		{
			int ld=n%10;//5
			sum=sum+fact(ld);
			n=n/10;
		}
		if (temp==sum)
		{
			System.out.println("strong number");
		}
		else
		{
			System.out.println("not a strong number");
		}
		
	}

}

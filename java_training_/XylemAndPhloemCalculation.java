package java_training_;

import java.util.Scanner;
//wrong code make it correct
public class XylemAndPhloemCalculation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int n=sc.nextInt();
		int sum=0;
		int prod=1;
		int last=n%10;
		n/=10;

		int sumMean=0;
	
		while(n>9)
		{
			int ld =n%10;
			sumMean+=ld;
			n/=10;
		}
		int extremeSum = last +n;
		
		if (extremeSum==sumMean)
		{
			
			System.out.println("Xylem Number");
			sum=n+extremeSum;
			for(int i=1;i<n;i++)
			{
				if(n%i==0)
				{
					sum+=i;
				}
			}
			if(sum==n)
			{
				System.out.println("Sum is perfect number");
			}
			else
			{
				System.out.println("Sum is not perfect number");
			}
		}
		else
		{
			
			System.out.println("Phloem Number");
			prod=n*extremeSum;
			int pro=1;
			while(n>0)
			{
				int ld =n%10;
				sum=sum+ld;
				pro=pro*ld;
				n=n/10;

			}
			if(sum==pro)
			{
				System.out.println("spy number");
			}
			else
			{
				System.out.println("not spy number");
			}
		}
	}

}


//int n=sc.nextInt();
//int a=sc.nextInt();
//int sum=0;
//int prod=1;
//
//	sum=n+a;
//	prod=n*a;
//
//System.out.println(sum);
//System.out.println(prod);
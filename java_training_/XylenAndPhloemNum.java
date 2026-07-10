package java_training_;

import java.util.Scanner;

public class XylenAndPhloemNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int n=sc.nextInt();
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
		}
		else
		{
			System.out.println("Phloem Number");
		}
	}

}

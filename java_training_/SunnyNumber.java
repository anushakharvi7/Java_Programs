package java_training_;

import java.util.Scanner;



public class SunnyNumber {

	public static void main(String[] args) {
		System.out.println("enter a number:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int num=n+1;
		for(int i=1;i<=num;i++)
		{
			if(i*i==num)
			{
				System.out.println(n+"is a sunny number");
				return;
			}
			if(i*i>num)
			{
				System.out.println(n+"not a sunny number");
				return;
			}
		}
		
	}

}

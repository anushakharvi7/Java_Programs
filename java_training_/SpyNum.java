package java_training_;

import java.util.Scanner;

public class SpyNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int n=sc.nextInt();
		
		
		int sum=0;
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
			System.out.println("Spy Number");
		}
		else
		{
			System.out.println("not a spy");
		}
		
	}
	

}

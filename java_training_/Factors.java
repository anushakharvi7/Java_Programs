package java_training_;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int n=sc.nextInt();
//		for(int i=1;i<=n;i++) {
//			if(n%i==0)
//			{
//				System.out.println(i);	
				
	//}
			if (n%2==0)
			{
				System.out.println(n);	
				count++;
			}
			if(count==2)
			{
				System.out.println("prime");
			}
			else
			{
				System.out.println("notprime");
			}
		}
		
	}



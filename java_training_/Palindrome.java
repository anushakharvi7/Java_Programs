package java_training_;

import java.util.*;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("enter a number:");
		int n = sc.nextInt();
		temp=n;
		int rev=0;
		while(n>0)
		{
			int ld =n%10; 
			rev=rev*10+ld;
			n=n/10;
			
			if(n==rev)
			{
				System.out.println("Palindrome");
			}
			else
			{
				System.out.println("not palindrome");
			}
		}
	}

}

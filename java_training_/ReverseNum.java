package java_training_;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		System.out.println("enter a number:");

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int rev=0;
		while(n>0)//12>0//1>0
		{
			int ld =n%10; //3	//2	//1
			rev=rev*10+ld;//3	//32	//321
			n=n/10;//12 	//1	//0
			System.out.println(rev);
		}
		
			
		
	}

}

package java_training_;

import java.util.Scanner;

public class AutoMorphicNumber {

	public static void main(String[] args) {
		//the square of given number gives the ending as given number
		
		System.out.println("enter a number:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sq=n*n;
		while(n>0)
		{
			int ldn=n%10;
			int ldsq=sq%10;
			if(ldn!=ldsq)
			{
				System.out.println("not a automorphic");
				return;
			}
			n/=10;
			sq/=10;
		}
		System.out.println("Automorphic number");
		
	}

}

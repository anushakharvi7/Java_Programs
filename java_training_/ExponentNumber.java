package java_training_;

import java.util.*;

public class ExponentNumber {

	public static void main(String[] args) {
		System.out.println("enter a number:");

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=sc.nextInt();
		int exp=1;
		for(int i=1;i<a;i++)
		{
			int exp = n^a;
		}
		System.out.println(exp);

	}

}

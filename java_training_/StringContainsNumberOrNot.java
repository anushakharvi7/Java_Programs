package java_training_;

import java.util.Scanner;

public class StringContainsNumberOrNot {	//also vice-versa 

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String 1");
		String s=sc.nextLine();
		int flag=0;
		for(int i=0;i<=s.length()-1;i++)
		{
			char c=s.charAt(i);
//			if(c>='0'&&c<='9')
if(!(c>='a'&&c<='z'))				//for alphabets
//			if(!(c>='0'&&c<='9'))
			{
				flag=1;
//				System.out.println("it does not contain only numbers");
					System.out.println("it does not contain only alphabets");
				return;
			}
		}
	if(flag==0)
	{
//		System.out.println("it contains only number");
		System.out.println("it contains only alphabets");
	}
		
	}

}

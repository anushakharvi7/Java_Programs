package programs;

import java.util.Scanner;

public class PrintEveryCharOfString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:");
		String s=sc.nextLine();
		int count=0;
		for(int i=0;i<=s.length()-1;i++)
		{
			char c=s.charAt(i);
			count++;
			System.out.println(c);
		}
	
	}

}

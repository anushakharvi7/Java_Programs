package programs;

import java.util.Scanner;

public class ReplaceCharWithAnother {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:");
		String s=sc.nextLine();
		System.out.println("enter the character to be replaced:");
		char ch1=sc.next().charAt(0);
		System.out.println("enter the character to be placed:");
		char key=sc.next().charAt(0);
		String s1="";
		for(int i=0;i<=s.length()-1;i++)
		{
			char c=s.charAt(i);
			if(s.charAt(i)!=ch1) 
			{
				s1=s1+s.charAt(i);
			}
			else
			{
				s1=s1+key;
			}
		}
		System.out.println(s1);
	}
}

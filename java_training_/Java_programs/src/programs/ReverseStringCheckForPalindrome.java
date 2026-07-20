package programs;

import java.util.Scanner;

public class ReverseStringCheckForPalindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:");
		String s1=sc.nextLine();
		String s2="";
		for(int i=0;i<=s1.length()-1;i++)
			s2=s1.charAt(i)+s2;
		System.out.println(s2);
	
	if(s1.equals(s2))
	{
		System.out.println("Palindrome");
	}
	else
	{
		System.out.println("Not a Palindrome");
	}

}
}


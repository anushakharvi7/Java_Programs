package java_training_;

import java.util.Scanner;

public class ComboPalindromeVowelConsonantsRepeater {
	
	
	public static boolean isPalindrome(String s)
	{
		String rev="";
		for (int i =s.length()-1;i>=0;i--)
		{
//			char c =s.charAt(i);
//			res=c+res;   
			rev=rev+s.charAt(i);
		}
		if (rev.equals(s))
			return true;
		else 
			return false;
	}

		
	

	public static void countVC(String s)
	{
		int countV=0,countC=0;
		for (int i =0; i<=s.length()-1;i++)
		{
			char c =s.charAt(i);
			if(c=='A' ||c=='E'||c=='I'||c=='O'||c=='U'||c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
			countV++;
			else
				countC++;
	}
		System.out.println("vowel count"+countV);
		System.out.println("consonant count"+countC);

	}
	
	public static void firstRepeatingChar(String s)
	{
		int flag=0;
		for(int i=0;i<=s.length()-1;i++) {
			char c=s.charAt(i);
			int count=0;
			
			for(int j=0;j<=s.length()-1;j++) {
				if(s.charAt(j)==c)
					count++;
							
			}
			if(count>=1)
			{
				flag=1;
			
				System.out.println("First Repeating char:"+c);
			break;
		}
			if(flag==0)
				System.out.println("no repeating character");
			
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string:");
		String s=sc.nextLine();
		String res="";
		if(isPalindrome(s))
		{
			countVC(s);
		}
		else
		{
			firstRepeatingChar(s);
		}
	
		
}
}

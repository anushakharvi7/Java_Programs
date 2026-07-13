package java_training_;

import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String 1");
		String s1=sc.nextLine();//silent
		System.out.println("Enter a String 2");
		String s2=sc.nextLine();//listen
		if(s1.length()!=s2.length())
		{
			System.out.println("Not Anagrams");
			return;
		}
		for (int i =1; i<=s1.length()-1;i++)
		{
			
			char c = s1.charAt(i);
			int count1=0;
			int count2=0;
			for(int j=0;j<=s1.length()-1;j++)
			{
				if(s1.charAt(j)==c)
				{
					count1++;
				}
			}
			for(int k=0;k<=s2.length()-1;k++)
			{
				if(s2.charAt(k)==c)
				{
					count2++;
				}
			}
			if(count1!=count2)
			{
				System.out.println("Not Anagrams");
				return;
			}
		}
		System.out.println("Anagrams");
		
		
			}
			
	

	}


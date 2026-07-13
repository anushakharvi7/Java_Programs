package java_training_;

import java.util.Scanner;

public class SmallestWordInString {


		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a String 1");
			String s=sc.nextLine();
			String word="";
			String smallest=s;
			for(int i=0;i<=s.length()-1;i++)
			{
				char c=s.charAt(i);
				if(c!=' ')
				{
					word=word+c;
				}
				else
				{
					if(word.length()<smallest.length())
					{
						smallest=word;
					}
					word="";
				}
				}
			if(word.length()<smallest.length())
			{
				smallest=word;
			}
				
			System.out.println(smallest);
				
				
	}

	}
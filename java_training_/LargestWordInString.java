package java_training_;

import java.util.Scanner;

public class LargestWordInString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String 1");
		String s=sc.nextLine();
		String word="";
		String larg="";
		for(int i=0;i<=s.length()-1;i++)
		{
			char c=s.charAt(i);
			if(c!=' ')
			{
				word=word+c;
			}
			else
			{
				if(word.length()>larg.length())
				{
					larg=word;
				}
				word="";
			}
			}
		if(word.length()>larg.length())
		{
			larg=word;
		}
			
		System.out.println(word);
			
			
}

}
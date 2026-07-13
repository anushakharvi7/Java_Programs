package java_training_;

import java.util.Scanner;

public class PrintIndividualWordsInString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String 1");
		String s=sc.nextLine();
		String word="";
		for(int i=0;i<=s.length()-1;i++)
		{
			char c=s.charAt(i);
			if(c!=' ')
			{
				word=word+c;
			}
			else
			{
				System.out.println(word);
				word="";
			}
		}
		System.out.println(word);
			
			
}

}
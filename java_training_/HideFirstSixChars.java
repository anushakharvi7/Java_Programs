package java_training_;

import java.util.Scanner;

public class HideFirstSixChars {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String s=sc.nextLine();
		String res=" ";
		for (int i =0; i<=s.length()-1;i++)
		{
			char c =s.charAt(i);
			if(i<=5)
			{
				
				res=res+'x';
			}
			else
			{
				res=res+c;
			}
			
		}
		System.out.println(s);
		System.out.println(res);

		}
		
	}



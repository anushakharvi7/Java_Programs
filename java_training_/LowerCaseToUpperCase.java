package java_training_;

import java.util.Scanner;

public class LowerCaseToUpperCase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String s=sc.nextLine();
		String res=" ";
		for (int i =0; i<=s.length()-1;i++)
		{
			char c =s.charAt(i);
			if(c>='a'&&c<='z')
			{ 
				
				res=res+(char)(c-32);
			}
			else
			{
				res+=c;
			}
			
		}
		System.out.println(res);

		}
		
	}



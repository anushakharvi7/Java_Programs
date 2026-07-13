package java_training_;

import java.util.Scanner;

public class SwapFirstAndLastCharOfString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String s=sc.nextLine();
		char first = s.charAt(0);
		char last=s.charAt(s.length()-1);
		String res="";
		res=res+last;
		
		for (int i =1; i<=s.length()-2;i++)
		{
			char c =s.charAt(i);
			res=res+c;
		}
				res=res+first;
				System.out.println(res);
			}
			
	

	}


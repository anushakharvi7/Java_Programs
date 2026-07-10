package java_training_;

import java.util.Scanner;

public class RemoveOddIndexCharInString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String s=sc.nextLine();
		String res="";
		for (int i =0; i<=s.length()-1;i++)
		{
			char c =s.charAt(i);
			if(s.charAt(i)==i%2)
			{
				res=res+'_';
			}
			else
			{
				res+=c;
			}
			
		}
	System.out.println(res);

	}
//remove the odd index char 
}

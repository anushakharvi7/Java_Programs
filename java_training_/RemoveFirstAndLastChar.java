package java_training_;

import java.util.Scanner;

public class RemoveFirstAndLastChar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String s=sc.nextLine();
		String res="";
		for (int i =1; i<=s.length()-2;i++)
		{
			res=res+s.charAt(i);
		}
		System.out.println(res);

		}
		
	}

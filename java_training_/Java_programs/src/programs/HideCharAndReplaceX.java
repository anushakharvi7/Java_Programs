package programs;

import java.util.Scanner;

public class HideCharAndReplaceX {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:");
		String s1=sc.nextLine();
		String s2="";
		for(int i=0;i<s1.length();i++)
		{
			if(i<6)
				s2='X'+s2;
			else
			
				s2=s2+s1.charAt(i);
	}
		
		System.out.println(s2);	
		
}
}

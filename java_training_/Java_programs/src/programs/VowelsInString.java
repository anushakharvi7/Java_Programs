package programs;

import java.util.Scanner;

public class VowelsInString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:");
		String s=sc.nextLine();
		int count=0;
		for(int i=0;i<=s.length()-1;i++)
		{
			char c=s.charAt(i);
			count++;
		
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
		{
			System.out.println(c);
		}
	
	}
	}
}

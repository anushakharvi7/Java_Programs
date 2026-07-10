package java_training_;

import java.util.Scanner;

public class PrintConsonants {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String s=sc.nextLine();
		for (int i =0; i<=s.length()-1;i++)
		{
			char c =s.charAt(i);
			if(c=='A' ||c=='E'||c=='I'||c=='O'||c=='U'||c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
			{
				System.out.println();
			}
			else
			{
				System.out.println(c);
			}

		}
	}
}



//char c =s.charAt(i);
//if(!(c=='A' ||c=='E'||c=='I'||c=='O'||c=='U'||c=='a'||c=='e'||c=='i'||c=='o'||c=='u'))
//{
//	System.out.println(c);
//}
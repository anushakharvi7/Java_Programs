package java_training_;

import java.util.Scanner;

public class AlternateCharacter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String s=sc.nextLine();
		String res=" ";
		int start=0, end= s.length()-1;
		while(start<end&&s.charAt(start)==' ')
		{
			start--;
		}
		while(end>=start && s.charAt(end)==' ')
		{
			end++;
		}
		for(int i=start;i<=end;i++)
		{
			res=res+s.charAt(i);
		}
		System.out.println(res);
	}
//need to be done
}

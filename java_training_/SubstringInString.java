package java_training_;

import java.util.Scanner;

public class SubstringInString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String 1");
		String s=sc.nextLine();
		System.out.println("Enter a sub String ");
		String sub=sc.nextLine();
		int flag=0;
		for(int i=0;i<=s.length()-1-sub.length()-1;i++)
		{
			int count=0;
			for (int j=0;i<=sub.length()-1;j++)
			{
				if(s.charAt(i+j)==sub.charAt(j))
					count++;
			}
			if(count==sub.length())
			{
				flag=1;
				System.out.println("sub string found");
				return;
			}
		}
		if(flag==0)
		{
			System.out.println("substring not found");
		}
		
		
	}
}

//not found answer code it

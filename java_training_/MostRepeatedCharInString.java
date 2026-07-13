package java_training_;

import java.util.Scanner;

public class MostRepeatedCharInString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String s=sc.nextLine();
		int max=0;
		char maxchar='a';
		
		for(int i=0;i<=s.length()-1;i++) {
			char c=s.charAt(i);
			int count=0;
			
			for(int j=0;j<=s.length()-1;j++) {
				if(s.charAt(j)==c)
					count++;
							
			}
			if(count>max)
			{
				max=count;
				maxchar=c;
			}
		}
				System.out.println(maxchar);
		}
			
	}


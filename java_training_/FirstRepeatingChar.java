package java_training_;

import java.util.Scanner;

public class FirstRepeatingChar {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String s=sc.nextLine();
		
		
		for(int i=0;i<=s.length()-1;i++) {
			char c=s.charAt(i);
			int count=0;
			
			for(int j=0;j<=s.length()-1;j++) {
				if(s.charAt(j)==c)
					count++;
							
			}
			if(count>=2)
				System.out.println(c);
		}
			
	}

}
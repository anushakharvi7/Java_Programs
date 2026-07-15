package programs;

import java.util.Arrays;
import java.util.Scanner;

public class PrintRepeatedChar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String ");
		String s =sc.nextLine();
		int count=0;
		for(int i=0;i<=s.length()-1;i++) {
			char c =s.charAt(i);
			if(c!=' ') {
				count++;
			}
		}
		char [] c = new char[count];
		int index=0;
		for(int i=0;i<=s.length()-1;i++) {
			char ch=s.charAt(i);
			if(ch!=' ') {
				c[index]=ch;
				index++;
			}
		}
		System.out.println(Arrays.toString(c));
		
		char large=c[0];
		int largecount=0;
		for(int i=0;i<=c.length-1;i++) {
			char ch=c[i];
			int countch=0;
			for(int j=0;j<=c.length-1;j++) {
				if(ch==c[j]) {
					countch++;
				}
				
			}
			if(countch>largecount) {
				largecount=countch;
				large=ch;
				
			}
		}
		System.out.println(large);
	}
}

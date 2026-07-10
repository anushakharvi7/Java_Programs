package java_training_;

import java.util.Scanner;

public class InsertCharAtStartAndEnd {



		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a String");
			String s = sc.nextLine();
			System.out.println("Enter character to insert at starting");
			char start=sc.next().charAt(0);
			System.out.println("Enter character to insert at ending");
			char end=sc.next().charAt(0);
			String res="";
			res=start+s+end;
			System.out.println(res);
			
			
			

		}

	}
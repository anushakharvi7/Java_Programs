package java_training_;

import java.util.Scanner;
import java.util.*;
public class Panagram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String 1");
		String s=sc.nextLine();
		s.toLowerCase();//for lower case
		for(char c='a';c<='z';c++)
		{
			if(s.indexOf(c)==-1)
			{
				System.out.println("Not Panagrams");
				return;
			}
		
		}
				System.out.println("Panagrams");

			}
		}
				

//pack my box with five dozen liquor jugs the quickbrown fox jumps over the lazy dog

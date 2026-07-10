package java_training_;

import java.util.Scanner;

public class ExtractFirstDigit {

	public static void main(String[] args) {
		int n=123;
		while(n>9)
		{
			n/=10;
			
		}
		System.out.println(n);
	}

}

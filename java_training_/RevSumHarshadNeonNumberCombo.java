package java_training_;

import java.util.Scanner;

public class RevSumHarshadNeonNumberCombo {//reverse digit and sum

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=sc.nextInt();
		int sum=0;
		int rev=0;
		while(n>0)
		{
			int ld =n%10; 
			rev=rev*10+ld;
			n=n/10;
			sum+=ld;
		}
			System.out.println(rev);
			System.out.println(sum);
			if(sum<10)
			{
				
			}
		}

	}



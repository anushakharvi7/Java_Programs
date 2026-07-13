package java_training_;
import java.util.*;
public class ComboHarshadNeonNum {

	public static int reverse(int n)
	{
		int rev=0;
		while(n>0)
		{
			int ld=n%10;
			rev=rev*10+ld;
			n/=10;
		}
		return rev;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int n=sc.nextInt();
		int rev=reverse(n);
		int temp=rev;
		int sum=0;
		while(temp>0)
		{
			int ld=temp%10;
			sum+=ld;
			temp/=10;
		}
		if(sum>=10)
		{
			isHarshad(sum);
			
		}
		else
			isNeon(sum);
	}
	public static void isHarshad(int n)
	{
		int sum=0;
		int temp=n;
		while(n>0)
		{
			int ld=temp%10;
			sum+=ld;
			temp/=10;
		}
		if(n%sum==0)
				System.out.println("sum is harshad number");
		else
			System.out.println("sum is not a harshad number");
	}
	public static void isNeon(int n)
	{
		int sq=n*n;
		int sum=0;
		while(sq>0)
		{
			int ld=sq%10;
			sum=sum+ld;
			sq=sq/10;
		}
		if(sum==0)
		{
			System.out.println("neon number");
		}
		else
			System.out.println("not a neon number");
	}

}

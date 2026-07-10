package java_training_;
import java.util.*;
import java.util.Scanner;

public class StrongNumberSeries {
	
	
public static boolean isStrongNumber(int base, int fact) {
	int res=1;
	for(int i=1;i<=n;i++)
	{
		res=res*i;
	}
	return res;
}

	public static void main(String[] args) {
		public static int fact(int n)
		{
			
		}

		public static void main(String[] args) {
			
			System.out.println("enter a number:");
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			
			for(int i=start;i<=end;i++) {
				if(isStrongNumber(i))
				{
					System.out.println(i+", ");
				}
			
			
			
			
			int sum=0;
			int temp=n;
			while(n>0)
				
			{
				int ld=n%10;//5
				sum=sum+fact(ld);
				n=n/10;
			}
			if (temp==sum)
			{
				System.out.println("strong number");
			}
			else
			{
				System.out.println("not a strong number");
			}
			
		}

	}
	
	
	
	
	class ArmstrongNumberOneAndTwoK {
		public static int power(int base,int expo){
		int res=1;
		for(int i=1;i<=expo;i++) {
			res=res*base;
		}
		return res;
		}
		public static boolean isArmStrong(int n) {
			int temp=n;
			int count=0;
			while(temp>0) {
				count++;
				temp/=10;
			}
			int sum=0;
			int temp1=n;
			while(n>0) {
				int last=n%10;
				sum=sum+power(last,count);
				n/=10;
			}
			if(sum==temp1) {
				return true;
			}
			else {
				return false;
			}
		}
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter start value");
			int start=sc.nextInt();
			System.out.println("Enter start value");
			int end=sc.nextInt();
			for(int i=start;i<=end;i++) {
				if(isArmStrong(i))
				{
					System.out.println(i+", ");
				}
			}
		}
			
		}

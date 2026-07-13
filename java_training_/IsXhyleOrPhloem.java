package java_training_;
import java.util.*;
public class IsXhyleOrPhloem {
	
	public static void isPerfect(int n)
	{
		int sum=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
				sum+=i;
		}
		if(sum==n)
			System.out.println("sum is perfect number");
		else
			System.out.println("sum is not a perfect number");
	}
	public static void isSpy(int n)
	{
		int sum=0;
		int pro=1;
		while(n>0)
		{
			int ld=n%10;
			sum+=ld;
			pro*=ld;
			n/=10;
		}
		if(sum==pro)
			System.out.println("spy number");
		else
			System.out.println("not a spy number");
	}
	
	public static boolean isXhylem(int n)
	{
		int last=n%10;
		n=n/10;
		int meanSum=0;
		while(n>9)
		{
			int ld=n%10;
			meanSum=meanSum+ld;
			n/=10;
		}
		int extremeSum=last+n;
		if(meanSum==extremeSum)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		int sum=0, pro=1;
		int t1=n, t2=n;
		if(isXhylem(n))
		{
			while(t1>0)
			{
				int ld=t1%10;
				sum+=ld;
				t1/=10;
				
			}
			isPerfect(sum);
			
		}
		else
		{
			while(t2>0)
			{
				int ld=t2%10;
				pro*=ld;
				t2/=10;
			}
			isSpy(pro);
		}
	}

}

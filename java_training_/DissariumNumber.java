package java_training_;

import java.util.Scanner;

public class DissariumNumber {


// 135=a^1+3^2=5^3=135

public static int power(int base, int expo)
{
	int res=1;
	for(int i=1;i<=expo;i++)
	{
		res=res*base;
	}
	return res;

}

public static void main(String[] args) {
	System.out.println("enter a number:");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int count=0;
	int temp=n;
	while(temp>0)
	{
		
		count++;
		temp=temp/10;
}
	int temp1=n;
	int sum=0;
	while(n>0)
	{
		int ld=n%10;
		sum=sum+power(ld,count);
		count--;
		n=n/10;
	}
	if(temp1==sum)
	{
		System.out.println("Dissarium Number");
	}
	else
	{
		System.out.println("not Dissarium number");
	}
}
}


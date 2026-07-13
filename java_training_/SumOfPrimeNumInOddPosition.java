package java_training_;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfPrimeNumInOddPosition {
	
	public static boolean isPrime( int n)
	{
		int count=0;
		for (int i=1;i<=n;i++)
		{
			if(n%i==0)
				count++;
		}
		return count==2;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=sc.nextInt();
		int[] arr=new int[size];
		for (int i=0;i<=arr.length-1;i++)
		{
			System.out.println("enter the element for the index:"+i);
			arr[i]=sc.nextInt();
		}
		int sum=0;
		int prod=1;

		if(isPrime(size))
//			if(isPrime(arr[i]))

		{
		for (int i=0;i<=arr.length-1;i++)
		{
			
			if(i%2==1)
			{
				sum+=arr[i];
			}
		}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("Sum of Prime elements in Odd Position:"+sum);
//		System.out.println("Product of odd elements:"+prod);
	

	}

}



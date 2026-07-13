package java_training_;

import java.util.Arrays;
import java.util.Scanner;

public class PrimeElementsFromTwoArrayAtOddIndex {
	
	public static boolean isPrime(int n)
	{
		int count=0;
		for (int i=1;i<=n;i++)
		{
			if(n%i==0)
				count++;
		}
		return count==2;
	}
	

	public static int countPrime(int [] arr)
	{
		int count=0;
		for (int i=1;i<=arr.length-1;i++)
		{
			if(i%2==1&&isPrime(arr[i]))
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array 1");
		int size1=sc.nextInt();
		int[] a=new int[size1];
		for (int i=0;i<=a.length-1;i++)
		{
			System.out.println("enter the element for the index:"+i);
			a[i]=sc.nextInt();
		}
		System.out.println("enter the size of array 2");
		int size2=sc.nextInt();
		int[] b=new int[size2];
		for (int i=0;i<=b.length-1;i++)
		{
			System.out.println("enter the element for the index:"+i);
			b[i]=sc.nextInt();
		
		}
		int count1=countPrime(a);
		int count2=countPrime(b);

		int c[]=new int[count1+count2];
		int index=0;
		for(int i=0;i<=a.length-1;i++)
		{
			if(isPrime(a[i])&&i%2==1)
			{
				c[index]=a[i];
				index++;
			}
		}
		for(int i=0;i<=b.length-1;i++)
		{
			if(isPrime(b[i])&&i%2==1)
			{
				c[index]=b[i];
				index++;
			}
		}
		
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(c));


	
	}

}

package programs;

import java.util.Arrays;
import java.util.Scanner;

public class SplittingArrayForPrime {
	

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

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array ");
		int size=sc.nextInt();
		int[] arr=new int[size];
		for (int i=0;i<=arr.length-1;i++)
		{
			System.out.println("Enter the element for the index:"+i);
			arr[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		int countP=0,countNp=0;
		for(int i:arr)
		{
			if(isPrime(i))
				countP++;
			else
				countNp++;
		}
		int primes[]=new int[countP];
		int Nonprimes[]=new int[countNp];
		int primeI=0,nonPrimeI=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			
			if(primeI==2) {
				primes[primeI]=arr[i];
				primeI++;
			}
		
		else
		{
			Nonprimes[nonPrimeI]=arr[i];
			nonPrimeI++;
		}
		}
	
	System.out.println(Arrays.toString(primes));
	System.out.println(Arrays.toString(Nonprimes));

}
}


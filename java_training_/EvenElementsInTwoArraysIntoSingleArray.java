package java_training_;

import java.util.Arrays;
import java.util.Scanner;

class EvenElementsInTwoArraysIntoSingleArray {
	
	public static int countEven(int [] temp)
	{
		int even=0;
		for(int i:temp)
		{
			if(i%2==0)
				even++;
		}
		return even;
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
		int count1=countEven(a);
		int count2=countEven(b);
		int [] c=new int[count1+count2];
		int index=0;
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]%2==0)
			{
				c[index]=a[i];
				index++;
			}
		}
		for(int i=0;i<=b.length-1;i++)
		{
			if(b[i]%2==0)
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

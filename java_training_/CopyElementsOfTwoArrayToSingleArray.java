package java_training_;

import java.util.Arrays;
import java.util.Scanner;

public class CopyElementsOfTwoArrayToSingleArray {

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
		int[]c=new int[a.length+b.length];
		int index=0;
		for(int i=0;i<=a.length-1;i++)
		{
			c[index]=a[i];
			index++;
		}
		for(int i=0;i<=b.length-1;i++)
		{
			c[index]=b[i];
			index++;
		}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(c));

	}

}

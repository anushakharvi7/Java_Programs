package java_training_;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

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
		int []brr=new int[arr.length];
		int index=0;
		for(int i=arr.length-1;i>=0;i--)
		{
			brr[index]=arr[i];
			index++;
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(brr));
	}

}

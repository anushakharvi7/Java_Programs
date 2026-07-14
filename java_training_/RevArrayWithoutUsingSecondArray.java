package java_training_;

import java.util.Arrays;
import java.util.Scanner;

public class RevArrayWithoutUsingSecondArray {

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
		int start=0,end=arr.length-1;
		int temp=0;
		System.out.println(Arrays.toString(arr));
		while(start<end)
		{
			temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		System.out.println(Arrays.toString(arr));
	}

}

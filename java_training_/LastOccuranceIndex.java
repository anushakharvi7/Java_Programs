package java_training_;

import java.util.Arrays;
import java.util.Scanner;

public class LastOccuranceIndex {  

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
		System.out.println("Enter key value");
		int key = sc.nextInt();
		System.out.println(Arrays.toString(arr));
//		for(int i=arr.length-1;i<=0;i--) {
//			if(arr[i]==key) {
//				System.out.println("Elements found at index:"+i);
//				return;
//				
//			}
//		}
		int index=0;
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]==key)
			{
				index=i;
			}
		}
		if(index==-1)
			
		System.out.println("Element not present");
		else
			System.out.println("element found"+index);
		
		}
			
		

	}
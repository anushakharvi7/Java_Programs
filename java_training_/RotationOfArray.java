package java_training_;

import java.util.Arrays;
import java.util.Scanner;

public class RotationOfArray {
	
//	public static int leftShift(int[] a)
//	{
//		int temp=0;
//		for(int i=0;i<a.length-1;i++) {
//			a[i]=a[i+1];
//			
//		}
//		a[a.length-1]=0;
//		System.out.println("After Shifting:"+Arrays.toString(a));
//		return temp;
//
//	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a size of the Array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println("Enter the elements of the index:"+i);
			arr[i]=sc.nextInt();
		}
		System.out.println("Before shifting:"+Arrays.toString(arr));
		int temp=arr[0];
		
		
	
		for(int i=0;i<arr.length-1;i++) {
			
			arr[i]=arr[i+1];
			
		}
		
		arr[arr.length-1]=temp;
		
		System.out.println("After Shifting:"+Arrays.toString(arr));
	}
}
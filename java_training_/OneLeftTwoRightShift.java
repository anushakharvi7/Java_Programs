package java_training_;

import java.util.Arrays;
import java.util.Scanner;

public class OneLeftTwoRightShift {
	
	public static int leftShift(int[] a)
	{
		int temp=0;
		for(int i=0;i<a.length-1;i++) {
			a[i]=a[i+1];
			
		}
		a[a.length-1]=0;
		System.out.println("After Shifting:"+Arrays.toString(a));
		return temp;

	}
	public static int rightShift(int [] arr2)
	{
		for(int i=arr2.length-1;i>0;i--)
		{
			arr2[i]=arr2[i-1];
			
		}
	arr2[0]=0;
	System.out.println("After Array shifted to right position"+Arrays.toString(arr2));
	return 0;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a size of the Array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println("Enter the elements of the index:"+i);
			arr[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		if(size>0)
		{
			rightShift(arr);
			leftShift(arr);
		}
		int a=0;
		a=leftShift(arr)+2*rightShift(arr);
		System.out.println(Arrays.toString(arr));
		


	}

}





//public static void leftShift(int arr[]) {
//	
//	System.out.println("Before shifting the Array to Left:"+Arrays.toString(arr));
//
//	
//	
//	for(int i=0;i<arr.length-1;i++) {
//		arr[i]=arr[i+1];
//		
//	}
//	arr[arr.length-1]=0;
//	
//	
//}
//
//public static void rightShift(int arr[]) {
//	System.out.println("Before shifting to the right:"+Arrays.toString(arr));
//
//	for(int i=arr.length-1;i>0;i--) {
//		arr[i]=arr[i-1];
//		
//	}
//	arr[0]=0;
//	
//}
//
//public static void main(String[] args) {
//	Scanner sc=new Scanner(System.in);
//	System.out.println("Enter a size of the Array");
//	int size=sc.nextInt();
//	int arr[]=new int[size];
//	
//	for(int i=0;i<=arr.length-1;i++) {
//		System.out.println("Enter the elements of the index:"+i);
//		arr[i]=sc.nextInt();
//	}
//	leftShift(arr);
//	System.out.println("After Shifting 1st left shift:"+Arrays.toString(arr));
//	leftShift(arr);
//	System.out.println("After Shifting 2nd left shift:"+Arrays.toString(arr));
//	rightShift(arr);
//	System.out.println("After Shifting to the right:"+Arrays.toString(arr));
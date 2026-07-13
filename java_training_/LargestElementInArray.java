package java_training_;

import java.util.Scanner;

public class LargestElementInArray {

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
//		int largest=arr[0];
		int smallest=arr[0];

		for(int i:arr)
		{
//			if(i>largest)
//			if(i<largest)
			if(i<smallest)


//				largest=i;
				smallest=i;

		}
//		System.out.println("the largest element in array is:"+largest);
		System.out.println("the smallest element in array is:"+smallest);


	}

}

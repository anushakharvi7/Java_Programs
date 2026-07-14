package java_training_;

import java.util.Arrays;
import java.util.Scanner;

public class ShiftArrayOnePositionToLeft {

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

		
		int temp=0;
		for(int i=0;i<arr.length-1;i++) {
			arr[i]=arr[i+1];
			
		}
		arr[arr.length-1]=0;
		System.out.println("After Shifting:"+Arrays.toString(arr));
	}
}
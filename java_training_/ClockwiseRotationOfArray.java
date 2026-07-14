package java_training_;

import java.util.Arrays;
import java.util.Scanner;

public class ClockwiseRotationOfArray {

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
		int temp=arr[arr.length-1];
		
		
	
		for(int i=arr.length-1;i>0;i--) {
			
			arr[i]=arr[i-1];
			
		}
		
		arr[0]=temp;
		
		System.out.println("After Shifting:"+Arrays.toString(arr));
	}
}
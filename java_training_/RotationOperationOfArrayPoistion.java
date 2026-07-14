package java_training_;

import java.util.Arrays;
import java.util.Scanner;

public class RotationOperationOfArrayPoistion {


		public static void leftRotation(int []arr) {
			int temp=arr[0];
			for(int i=0;i<arr.length-1;i++) {
				arr[i]=arr[i+1];
				
			}
			arr[arr.length-1]=temp;
		}
		
		public static void leftShift(int arr[]) {
			
			System.out.println("Before shifting the Array to Left:"+Arrays.toString(arr));
		
			
			
			for(int i=0;i<arr.length-1;i++) {
				arr[i]=arr[i+1];
				
			}
			arr[arr.length-1]=0;
		}
		public static void rightShift(int arr[]) {
			System.out.println("Before shifting to the right:"+Arrays.toString(arr));
		
			for(int i=arr.length-1;i>0;i--) {
				arr[i]=arr[i-1];
				
			}
			arr[0]=0;

		}
		public static void rightRotation(int []arr) {
			int temp=arr[arr.length-1];
			for(int i=arr.length-1;i>0;i--) {
				arr[i]=arr[i-1];
				
			}
			arr[0]=temp;
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
			System.out.println("Before shifting:"+Arrays.toString(arr));
			
			leftRotation(arr);
			System.out.println("After 1st left rotation:"+Arrays.toString(arr));
			leftRotation(arr);
			System.out.println("After 2nd left rotation:"+Arrays.toString(arr));
			rightRotation(arr);
			System.out.println("After 1st right rotation:"+Arrays.toString(arr));
			rightRotation(arr);
			System.out.println("After 1st right rotation:"+Arrays.toString(arr));
			rightRotation(arr);
			System.out.println("After 1st right rotation:"+Arrays.toString(arr));
			for(int i=0;i<=arr.length-1;i++) {
				if(arr[i]==67) {
					System.out.println("index  found at 67  :"+i);
					return;

			}
		}
		}
}
	
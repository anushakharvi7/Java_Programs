package java_training_;

import java.util.Arrays;
import java.util.Scanner;

public class CommonElementBetweenTwoArrays {

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the size of array 1");
			int size=sc.nextInt();
			int[] arr=new int[size];
			for (int i=0;i<=arr.length-1;i++)
			{
				System.out.println("Enter the element for the index:"+i);
				arr[i]=sc.nextInt();
			}
			System.out.println("Enter the size of array 2");
			int size1=sc.nextInt();
			int[] arr1=new int[size];
			for (int i=0;i<=arr.length-1;i++)
			{
				System.out.println("Enter the element for the index:"+i);
				arr1[i]=sc.nextInt();
			}
			
			for(int i=0;i<=arr.length-1;i++) {
				int val = arr[i];
				for(int j=0;j<=arr1.length-1;j++) {
					if(val==arr1[j]) {
						arr[i]=-1;
						arr1[j]=-1;
						System.out.println(val+" ");
						
					}
				}
			}
		}
}
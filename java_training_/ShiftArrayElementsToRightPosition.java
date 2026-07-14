package java_training_;

import java.util.Arrays;
import java.util.Scanner;

public class ShiftArrayElementsToRightPosition {

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
		System.out.println("Before shifting: ");
		System.out.println(Arrays.toString(arr));

		for(int i=arr.length-1;i>0;i--)
			{
				arr[i]=arr[i-1];
				
			}
		arr[0]=0;
		System.out.println("After Array shifted to right position"+Arrays.toString(arr));

		}
	}


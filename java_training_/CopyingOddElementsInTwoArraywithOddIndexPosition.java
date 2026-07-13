package java_training_;

import java.util.Arrays;
import java.util.Scanner;

public class CopyingOddElementsInTwoArraywithOddIndexPosition {

		public static void main(String[] args) {
		
				Scanner sc=new Scanner(System.in);
				System.out.println("enter the size of array:");
				
				
				int size=sc.nextInt();
				int []arr= new int[size];
				
				for(int i=0;i<=arr.length-1;i++) {
					System.out.println("enter the element for index:"+i);
					arr[i]=sc.nextInt();
				}
		int sum=0;
		int pro=1;
		for(int i: arr)
		{
			sum+=i;
		}
		double avg=(double)sum/size;
		System.out.println("average"+avg);
		System.out.println("elements are");
		for(int i:arr)
		{
			if(i<avg)
				System.out.println(i);
		}
		}}
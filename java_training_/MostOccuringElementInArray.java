package java_training_;

import java.util.Arrays;
import java.util.Scanner;

public class MostOccuringElementInArray {

	
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the size of array ");
			int size1=sc.nextInt();
			int[] arr=new int[size1];
			for (int i=0;i<=arr.length-1;i++)
			{
				System.out.println("enter the element for the index:"+i);
				arr[i]=sc.nextInt();
			}
			int max=0;
			int maxEle=arr[0];
			
			for(int i=0;i<arr.length;i++)
			{
				int val=arr[i];
				int count=0;
				for(int j=0;j<arr.length-1;j++)
				{
				if(arr[j]==val)
					count++;
				}
				if(count>max)
				{
					maxEle=val;
					max=count;
				}
			}
			System.out.println(Arrays.toString(arr));
			System.out.println("max occuring element is:"+maxEle);
		
		}
		}

			
			 
			

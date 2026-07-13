package java_training_;

import java.util.Scanner;

public class SearchIfElementIsPresentInArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array 1");
		int size1=sc.nextInt();
		int[] arr=new int[size1];
		for (int i=0;i<=arr.length-1;i++)
		{
			System.out.println("enter the element for the index:"+i);
			arr[i]=sc.nextInt();
		}
		System.out.println("enter the key element");
		int key=sc.nextInt();
		for(int i:arr)
		{
			if(i==key)
			{
				System.out.println("element is found");
				return;
			}
		}
				System.out.println("The element is not present in the Array *_*");
			}	
			}
		
		 
		

package java_training_;

import java.util.Scanner;

public class FirstOccuranceIndex {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array ");
		int size=sc.nextInt();
		int[] arr=new int[size];
		for (int i=0;i<=arr.length-1;i++)
		{
			System.out.println("Enter the element for the index:"+i);
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter key value");
		int key = sc.nextInt();
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]==key) {
				System.out.println("Elements found at index:"+i);
				return;
				
			}
		}
		System.out.println("Element not present");
		
		
		}
			
		

	}
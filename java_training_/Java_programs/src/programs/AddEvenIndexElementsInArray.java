package programs;

import java.util.Arrays;
import java.util.Scanner;

public class AddEvenIndexElementsInArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int size=sc.nextInt();
		int []arr=new int[size];
		int sum=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("enter the element for index:"+i);
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++)
		{
			if(i%2==0)
			{
				sum+=arr[i];
			}
		}
		System.out.println("Array:"+Arrays.toString(arr));
		System.out.println("Sum of elemnets in even Index:"+sum);
		
		

	}

}

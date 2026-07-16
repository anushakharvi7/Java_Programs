package programs;

import java.util.Arrays;
import java.util.Scanner;

public class AverageOfArrayElements {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int size=sc.nextInt();
		int []arr=new int[size];
		int sum=0;
		int avg=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("enter the element for index:"+i);
			arr[i]=sc.nextInt();
		}
		for(int i:arr)
		{
			sum=sum+i;
			avg=sum/size;
		}
		System.out.println("Array:"+Arrays.toString(arr));
		System.out.println("Average of elements of Array:"+avg);
	}
}	
		
		
		
		
		
		
package programs;

import java.util.Arrays;
import java.util.Scanner;

public class OddNumbersInArray {

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
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]%2!=0)
			{
				System.out.println(arr[i]);
			}
		}

	}

}

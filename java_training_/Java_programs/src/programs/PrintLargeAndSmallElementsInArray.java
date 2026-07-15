package programs;

import java.util.Arrays;
import java.util.Scanner;

public class PrintLargeAndSmallElementsInArray {

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
		System.out.println(Arrays.toString(arr));
		int index=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]!=0)
			{
				arr[index]=arr[i];
				index++;
			}
		}
		while(index<=arr.length-1)
		{
			arr[index]=0;
			index++;
		}
		System.out.println(Arrays.toString(arr));
		
	}

}

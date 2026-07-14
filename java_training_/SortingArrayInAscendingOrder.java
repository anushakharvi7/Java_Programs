package java_training_;

import java.util.Scanner;

public class SortingArrayInAscendingOrder {

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
		
		boolean b=true;
		for(int i=0;i<arr.length-2;i++)
{
	if(arr[i]<arr[i+1])
	{
		continue;
	}
	else
	{
		b=false;
		break;
	}
}
		if(b==true)
			System.out.println("Sorted");
		else
			System.out.println("not sorted");
		

	}

}

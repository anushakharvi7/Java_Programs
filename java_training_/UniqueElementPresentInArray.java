package java_training_;

import java.util.Arrays;
import java.util.Scanner;

public class UniqueElementPresentInArray {

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
		for(int i=0;i<=arr.length-1;i++) {
			int count=0;
			int val=arr[i];
			for(int j=0;j<=arr.length-1;j++) {
				if(val==arr[j])
					count++;
			}
			if(count==1)
			
				System.out.println(val);
			
		}
		}
	}



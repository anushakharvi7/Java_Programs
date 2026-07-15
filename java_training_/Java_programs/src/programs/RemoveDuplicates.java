package programs;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicates {

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
		
		int k=0;
		int res[]=new int[size];
		for(int i=0;i<=arr.length-1;i++)
		{
			boolean isPresent=false;
			for(int j=0;j<k;j++)
			{
				if(arr[i]==res[j])
				{
					isPresent=true;
					break;
				}
			}
			if(isPresent==false)
			{
				res[k]=arr[i];
				k++;
			}
		}
		for(int i=0;i<k;i++)
		{
			System.out.println(res[i]+" ");
		}
		
	}

}

package java_training_;

import java.util.Arrays;
import java.util.Scanner;

public class FreqOfEachElementInArray {

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
		for(int i=0;i<arr.length-1;i++)
		{
			int val=arr[i];
			if(val==-1)
				continue;
			int count=0;
			for(int j=0;j<arr.length-1;j++)
			{
				if(val==arr[j])
				{
					arr[j]=-1;
					count++;
				}
			}
			
			//if(count>1)
			//syso(val)
			
			System.out.println("frequency of " +val+" is:"+count);
		}
		
		
	}
}

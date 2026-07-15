package programs;

import java.util.Arrays;
import java.util.Scanner;

public class SplittingArrayForPrime {

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
		int count=0;
		for(int i:arr) {
			if(i%2==0) {
				count++;
			}
			if(count==2)
				
				System.out.println((arr[i]));
			else
				System.out.println("no prime number");
//				even[evenI]=arr[i];
//				evenI++;
//			}
			
			
		}
		
//		System.out.println(Arrays.toString(odd));
		

	}
}


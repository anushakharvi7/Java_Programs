package java_training_;
import java.util.*;
import java.util.Scanner;

public class SumOfElementsOfArray {

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
		int sum=0;
		int prod=1;
		for(int i:arr)
		{
			sum+=i;
			prod*=i;
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("Sum of elements:"+sum);
		System.out.println("Product of elements:"+prod);

	}

}

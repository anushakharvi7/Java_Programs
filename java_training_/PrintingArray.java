package java_training_;
import java.util.*;
public class PrintingArray {

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
		System.out.println("the elements of array are");
		for(int i:arr)
		{
			System.out.println(i);
		}
		System.out.println(Arrays.toString(arr));

	}

}

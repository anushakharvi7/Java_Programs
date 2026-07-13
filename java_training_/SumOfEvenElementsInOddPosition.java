package java_training_;
import java.util.*;
public class SumOfEvenElementsInOddPosition {

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
			for (int i=0;i<=arr.length-1;i++)
			{
				if(i%2==1 && arr[i]%2==0)
				{
					sum+=arr[i];
				}
				if(i%2==0 && arr[i]%2==1)
				{
					prod*=arr[i];
				}
			}
	
			System.out.println(Arrays.toString(arr));
			System.out.println("Sum of even elements:"+sum);
			System.out.println("Product of odd elements:"+prod);
		

		}

	}

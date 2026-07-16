package programs;
import java.util.*;

public class EvenNumbers {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the start range:");
		int start=sc.nextInt();
		System.out.println("enter the end range");
		int end=sc.nextInt();
		for(int i=start;i<=end;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
	}

}

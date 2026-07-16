package programs;
import java.util.*;
public class IndividualDigitsOfGivenNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int num=sc.nextInt();
	
		while(num>0)
		{
			int n=num%10;
			System.out.println(n);
			num/=10;
			
		

		}
	}
}

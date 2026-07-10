package java_training_;
import java.util.*;
public class EvenOdd {

	public static void main(String[] args) {
		System.out.println("enter a number:");

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
//
//		if(n% 2==0) {
//			System.out.println("even");
//		}
//		else {
//			System.out.println("odd");
//		}
		
		//Using conditional operator
		System.out.println(n%2==0?"Even Number":"Odd Number");
	}

}




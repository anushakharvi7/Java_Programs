package java_training_;
import java.util.*;
public class Pattern_1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
				System.out.println("enter number of rows");
				int rows=sc.nextInt();
				System.out.println("enter number of columns");
				int cols=sc.nextInt();
	for(int j=1;j<=rows;j++)
		{
			for(int i=1;i<=cols;i++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}



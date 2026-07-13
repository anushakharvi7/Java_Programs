package java_training_;
import java.util.Scanner;
public class TwistedPrimeAndAutomorphic {
	
		public static boolean isPrime(int n)
		{
			int count=0;
			for (int i=1;i<=n;i++)
			{
				if(n%i==0)
					count++;
			}
			return count==2;
		}
//		public static int reverse(int n)
//		{
//			int rev=0;
//			while(n>0)
//			{
//				int ld=n%10;
//				rev=rev*10+ld;
//				n/=10;
//			}
//			return rev;
//		}
//		
		
		public static int isAutomorph(int n)
		{
			int sq=n*n;
			while(n>0)
			{
				int ldn=n%10;
				int ldsq=sq%10;
				if(ldn!=ldsq)
				{
					System.out.println("not a automorphic");
					break;
				}
				n/=10;
				sq/=10;
			}
			System.out.println("Automorphic number");
			return sq;
		}

		
		
		//if number is prime reverse that number and check if the reversed number is prime number,
			//then it is a twisted prime number
			
		public static void main(String[] args) {
			
			System.out.println("enter a number:");

			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			if(isPrime(n))
			{
//				int rev=reverse(n);
				if(isPrime(n))
				{
					System.out.println("Twisted prime");
				}
				else
				{
					
					System.out.println("not twisted prime");
				}
			}
			else
			{
				isAutomorph(n);
				System.out.println("not a prime");
			}
			
			
		}

	}

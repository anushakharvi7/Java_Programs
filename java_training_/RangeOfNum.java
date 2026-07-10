package java_training_;

public class RangeOfNum {
	
	public static boolean isPrime(int n)
	{
		int count =0 ;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count==2)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		
		int start = 1;
		int end=40;
		for (int i=start;i<end;i++)
		{
			if(isPrime(i)==true)
			{
				System.out.println(i);
			}
			
		}
		
		
		
		
//		System.out.println("enter the range:");
//
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		
		
		
	}

}

package java_training_;

import java.util.Scanner;

public class ArmstrongSeries {
	
	
		public static int power(int base,int expo){
		int res=1;
		for(int i=1;i<=expo;i++) {
			res=res*base;
		}
		return res;
		}
		public static boolean isArmStrong(int n) {
			int temp=n;
			int count=0;
			while(temp>0) {
				count++;
				temp/=10;
			}
			int sum=0;
			int temp1=n;
			while(n>0) {
				int last=n%10;
				sum=sum+power(last,count);
				n/=10;
			}
			if(sum==temp1) {
				return true;
			}
			else {
				return false;
			}
		}
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter start value");
			int start=sc.nextInt();
			System.out.println("Enter start value");
			int end=sc.nextInt();
			for(int i=start;i<=end;i++) {
				if(isArmStrong(i))
				{
					System.out.println(i+", ");
				}
			}
		}
			
		}


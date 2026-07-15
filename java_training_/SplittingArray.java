package programs;



	
		import java.util.Arrays;
		import java.util.Scanner;
		public class SplittingArray {
		

			public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the size of array ");
				int size=sc.nextInt();
				int[] arr=new int[size];
				for (int i=0;i<=arr.length-1;i++)
				{
					System.out.println("Enter the element for the index:"+i);
					arr[i]=sc.nextInt();
				}
				System.out.println(Arrays.toString(arr));
				int countE=0,countO=0;
				for(int i:arr) {
					if(i%2==0) {
						countE++;
					}
					else {
						countO++;
					}
				}
				int even[]=new int[countE];
				int odd[]=new int[countO];
				int evenI=0,oddI=0;
				
				
				for(int i=0;i<=arr.length-1;i++) {
					if(arr[i]%2==0) {
						even[evenI]=arr[i];
						evenI++;
					}
					else {
						odd[oddI]=arr[i];
						oddI++;
					}
					
					
				}
				System.out.println(Arrays.toString(even));
				System.out.println(Arrays.toString(odd));
				

			}
		}
		

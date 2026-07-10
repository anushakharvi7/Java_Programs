package java_training_;

public class Example {

	public static void main(String[] args) {
		int [] arr = {10,20,30};
		try {
//			System.out.println(10/5);
//			System.out.println(10/0);
			System.out.println(arr[4]);
		}
		catch(Exception a) {
			System.out.println(a.toString());
		}
		finally
		{
			System.out.println("Hey i'm executed always");
		}
//		catch(ArrayIndexOutOfBoundsException a) {
//			System.out.println(a.getMessage());
//		}
//		catch(ArithmeticException a) {
//			System.out.println(a.getMessage());
//		}
	}

}

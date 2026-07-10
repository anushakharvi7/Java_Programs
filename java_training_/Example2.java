package java_training_;

public class Example2 {
	public static void m1() throws Exception
	{
		throw new ArithmeticException("Don't divide with zero");
	}
		public static void abc() throws Exception
		{
			m1();
		}
	

	public static void main(String[] args) {
		try {
		abc();
		}
		catch(Exception e){
			System.out.println(e.toString());
		}
	}

}

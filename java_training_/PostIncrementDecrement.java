package java_training_;
	public class PostIncrementDecrement {
	    public static void main(String[] args) {
	        int a = 10;
	        int b = 10;

	        System.out.println("Initial value of a = " + a);
	        System.out.println("Initial value of b = " + b);

	        System.out.println("\nPost Increment:");
	        System.out.println("a++ = " + (a++));
	        System.out.println("Value of a after post increment = " + a);

	        System.out.println("\nPost Decrement:");
	        System.out.println("b-- = " + (b--));
	        System.out.println("Value of b after post decrement = " + b);
	    }
	}

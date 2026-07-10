package java_training_;

public class DecisionStatements {

	public static void main(String[] args) {
//		int age = 17;
//		if(age>18)
//		{
//			 System.out.println("Eligible to vote");
//		}
//		else
//		{
//			System.out.println("Come back after 18");
//		}
		int marks = 23;
		if(marks>=90)
		{
			System.out.println("A Grade");
		}
		else if(marks>=70 && marks <=80)
		{
			System.out.println("B Grade");
		}
		else if(marks>=50 && marks<=69)
		{
			System.out.println("C Grade");
		}
		else
		{
			System.out.println("Failed");
		}
	}

}

package java_training_;

public class InvalidAgeException extends Exception
{
	InvalidAgeException(String message)
	{
		super(message);
	}
}
class Verification
{
	public static void checkAge(int age) throws InvalidAgeException
	{
		if(age<18)
		{
			throw new InvalidAgeException("Come back after 18");
		}
	}
	public static void main(String[] args) {
		try
		{
			checkAge(16);
		}
		catch(InvalidAgeException i)
		{
			System.out.println(i.toString());
		}
		finally {
			System.out.println("verification done");
		}
	}
}
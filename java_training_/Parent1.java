package java_training_;

public class Parent1 {
	public static void abc()
	{
		System.out.println("Hi from Parent1");
	}
	static int a =10;
}
classChild1 extends Parent1
{
	public static void abc()
	{
	
		System.out.println("Hi from child1");
	}
	static int a = 20;
	public static void main(String[] args) {
		System.out.println(a);
		abc();
		System.out.println(Parent1.a);
		Parent1.abc();
	}
	}
}
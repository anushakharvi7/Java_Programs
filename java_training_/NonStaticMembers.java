package java_training_;

public class NonStaticMembers {
	int rno;
	public void m1()
	{
		System.out.println("Hello non-static");
	}
	String name="AIML";
	{
		System.out.println("I'm executed at Object");
	}
}
class NonStaticDriveer
{
	public static void main(String[] args) {
		NonStaticMembers n = new NonStaticMembers();
		System.out.println(n.rno);
		n.m1();
		System.out.println(n.name);
	}

}

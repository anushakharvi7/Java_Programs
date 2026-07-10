package java_training_;

abstract public class ParentAbstract {
	
	public abstract void m1();
	
	public static void m1()
	{
		System.out.println("Hello static");
	}
	int a =10;
	public void m2()
	{
		System.out.println("Hi non-static");
	}
}

class ChildAbstract extends ParentAbstract
{
	public void abc()
	{
		System.out.println("Ho from abc");
	}
}
class AbstractDriver
{
	public static void main(String [] args) {
		//ParentAbstract p = new ParentAbstract();
		ChildAbstract c = new ChildAbstract();
		c.m2();
		c.m1();
		c.abc();
		System.out.println(c.a);
	}
}

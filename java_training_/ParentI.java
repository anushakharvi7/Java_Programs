package java_training_;

public interface ParentI {
	public abstract void m1(int a);
	public static final int a=10;
	default void m2()
	{
		System.out.println("Hi non static");
	}
}
//class ChildI implements ParentI
//{
//	public void m1()
//	{
//		System.out.println("Hi from abstract");
//	}
//}
class InterfaceDriver
{
	public static void main(String[] args) {
		//ParentI p = new ParentI();
//		ChildI c= new ChildI();
//		c.m1();
//		c.m2();
//		System.out.println(c.a);
		ParentI p= (int a) -> {System.out.println(a);};
		p.m1(10);
		p.m2();
	}
}

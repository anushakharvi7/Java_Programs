package java_training_;

public class StaticMembers {
	
		static int a ;
		public static void m1()
		{
			System.out.println("I'm a static method");
		}
		static String college="VCET";
		static {
			System.out.println("Hey I executed");
		}
		public static void main(String[] args) {
			System.out.println(a);
			m1();
			System.out.println(college);
			System.out.println(A.marks);
		}

	
}
class A
{
	static double marks;
}
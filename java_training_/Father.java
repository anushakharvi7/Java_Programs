package java_training_;

public interface Father {
	public abstract void driving();
}
interface Mother
{
	public abstract void driving();
}
class ChildP implements Father, Mother
{
	public void driving(){
		System.out.println("Parents Driving");
	}
}
class DriverMultiple
{
	public static void main(String[] args) {
		ChildP c = new ChildP();
		c.driving();
	}
}
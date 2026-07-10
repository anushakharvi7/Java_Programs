package java_training_;

public class Laptop {
	int ram;
	double price;
	Laptop(int r, double p)
	{
		this.ram = r;
		this.price=p;
		System.out.println(ram);
		System.out.println(price);
	}
}	
	class LapyopDRiver
	{
	public static void main(String[] args) {
		Laptop l =new Laptop(15,120000);
	}
}

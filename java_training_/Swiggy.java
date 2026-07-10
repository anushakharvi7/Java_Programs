package java_training_;
class Swiggy{
	Swiggy(){
		System.out.println("NO args");
	}
	Swiggy (int price){
		System.out.println(price);
	}
	Swiggy(String message, int price)
}

public class Swiggy {
	public static void orderFood()
	{
		System.out.println("Ordered Food");
	}
	public static void orderFood(String message)
	{
		System.out.println(message+"biryani coming for u");
	}
	public static void orderFood(String message, int beverages)
	{
		System.out.println(message+"biryani coming for u"+beverages+"Added");
	}

	public static void main(String[] args) {
//		orderFood();//Ordered Food
//		orderFood("Double Spicy");//Double Spicy Biryani...
//		
//		orderFood("Double Spicy,2");
		
		Swiggy s1=new Swiggy();
		Swiggy s2 = new Swiggy(2);
		Swiggy s3 = new Swiggy("Good Delivery",3);
	}

}

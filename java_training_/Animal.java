package java_training_;

class Animal {
	
	String color;
	int noOfLegs;
}
class Dog extends Animal
{
	String breed;
}
class DriverDog
{
	
	public static void main(String[] args) {
//		
//		Dog d = new Dog();
//		System.out.println(d.breed);
//		System.out.println(d.color);
//		
//		Animal a = new Animal();
//		System.out.println(a.color);
//		//System.out.println(a.breed); //CTE
		
		Animal a = new Dog();  //Generalization // Upcasting 
		System.out.println(a.color);
		//System.out.println(a.breed);  //CTE
		
		Dog d = (Dog)a;
		System.out.println(d.breed);
		
	}

}

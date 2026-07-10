package java_training_;

class ATM {
	
	private int pin;
	public int getPin()
	{
		return pin;
	}
	public void setPin(int pin)
	{
		this.pin=pin;
	}
	
}
class ATMDriver
{
	public static void main(String[] args) {
		ATM a =new ATM();
		a.setPin(123123);
		System.out.println(a.getPin());
	}
}
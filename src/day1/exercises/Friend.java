package day1.exercises;

public class Friend extends Contact{
	public String phoneNumber;
	
	//static initialization block
	//which is executed when class is loaded by class loader.
	static {
        System.out.println("Step: class loader");
    }

	{
        System.out.println("Step: initialization block3");
    }
	//Constructor
	public Friend() {
        System.out.println("Step: construct");
	}
	
	{
        System.out.println("Step: initialization block");
    }
}

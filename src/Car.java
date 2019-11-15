import java.util.Date;

public class Car
{
	// Properties / State / Attributes 
	public String manufacturer;
	public String colour;
	public Date dateOfManufacture;

	public Engine engine = new Engine();
	
	private boolean locked;
	
	public void Lock( ) {
		locked = true;
	}
	
	public void Unlock() {
		locked = false;
	}
	
	public void PrintCarDetails( ) {
		System.out.println("Manufacturer: " + manufacturer);
		System.out.println("Colour: " + colour);
		System.out.println("Date of Manufacturer: " + dateOfManufacture);
		System.out.println("Is it locaked: " + locked);
		engine.PrintDetails();
	}
	
}

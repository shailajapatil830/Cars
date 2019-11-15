import java.io.Console;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args)
	{
		
	/*	int number = 10;
		String name = "Sunil";
*/
		// Engine - Class, diselEngine - Object / instance / variable of Engine class
		Engine diselEngine = new Engine();
		diselEngine.fuel = "Disel";
		diselEngine.engineType = "Manual";
		diselEngine.engineSize = 3;
		diselEngine.Start();
		diselEngine.Stop();
		diselEngine.PrintDetails();
		
		System.out.println("=======================================");
		
		Engine petrolEngine = new Engine();
		petrolEngine.fuel = "Petrol";
		petrolEngine.engineType = "Automatic";
		petrolEngine.engineSize = 2;
		petrolEngine.Start();
		petrolEngine.PrintDetails();
		
		System.out.println("=======================================");
		
		
		Car prius = new Car();
		prius.engine.engineSize = 2;
		prius.engine.engineType = "automatic";
		prius.engine.fuel = "petrol";		
		prius.manufacturer = "Toyota";
		prius.colour = "Black";
		prius.Unlock();
		prius.engine.Start();
		prius.PrintCarDetails();
		
		System.out.println("--------------------------------------------");
		
		Car bmw = new Car();
		bmw.manufacturer = "BMW";
		bmw.colour = "White";
		bmw.engine.engineSize = 4;
		bmw.engine.engineType = "manual";
		bmw.engine.fuel = "disel";
		bmw.Unlock();
		bmw.engine.Start();
		bmw.PrintCarDetails();		
	}
}

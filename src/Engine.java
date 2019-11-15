
public class Engine {
	
	// Properties / State / Variables
	public int engineSize;
	public String engineType;
	public String fuel;
	private String engineState;
	
	// Behaviour / Method / Function
	public void Start() {
		engineState = "Started";
	}
	
	public void Stop() {
		engineState = "Stop";
	}
	
	public void PrintDetails() {
		
		System.out.println("Engine type: " + engineType);
		System.out.println("Engine size: " + engineSize);
		System.out.println("Engine fuel: " + fuel);
		System.out.println("Engine state: " + engineState);
	}

}

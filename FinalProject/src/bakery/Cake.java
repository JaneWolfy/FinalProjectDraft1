package bakery;

public abstract class Cake {
	
	//Creates description and instruction for cake
	String description = "Unkown Cake";
	String instructions = "None";
	Double cost = 0.0;
	
	//Creates method to get description
	public String getDescription() {
		return description;
	}
	
	
	//Creates method to get instruction
	public String getInstructions() {
		return instructions;
	}
	
	public double cost() {
		return cost;
	}
}
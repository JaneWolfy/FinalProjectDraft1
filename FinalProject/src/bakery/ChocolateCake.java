package bakery;

public class ChocolateCake extends Cake {
	//Create ingredient factory
	IngrediantFactory factory=new IngrediantFactory();
	
	//Sets description and starts the instructions
	public ChocolateCake() {
		description = "Chocolate Cake ";
		
		instructions = factory.createChocolateBatter().toString();
		cost = 20.0;
	}

}

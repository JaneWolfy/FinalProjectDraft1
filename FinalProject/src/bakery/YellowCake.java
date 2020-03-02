package bakery;

public class YellowCake extends Cake {
	//Create ingredient factory
		IngrediantFactory factory=new IngrediantFactory();
		
		//Sets description and starts the instructions
		public YellowCake() {
			description = "Yellow Cake ";
			
			instructions = factory.createYellowBatter().toString();
			cost = 18.0;
		}
}

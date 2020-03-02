package bakery;

public class BirthdayDecorations extends Decoration {
	public Cake cake;
	IngrediantFactory factory = new IngrediantFactory();

	//Wraps Birthday Decorations around cake
	public BirthdayDecorations(Cake cake) {
		this.cake = cake;
	}
	
	//Adds candels and icing to cake description
	public String getDescription() {
		return cake.getDescription()+ "with Candels and Icing Writing";
	}
	
	public String getInstructions() {
		return cake.getInstructions()+ factory.createBirthdayDecorations();
	}
	//Adds cost of Birthday decorations to cake cost
	public double cost() {
		return 2.00 + cake.cost();
	}

}

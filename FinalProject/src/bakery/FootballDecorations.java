package bakery;

public class FootballDecorations extends Decoration {
	public Cake cake;
	IngrediantFactory factory = new IngrediantFactory();

	//Wraps Football Decorations around cake
	public FootballDecorations(Cake cake) {
		this.cake = cake;
	}
	
	//Adds Football decorations to cake description
	public String getDescription() {
		return cake.getDescription()+ "with Plastic Football and Icing Feild ";
	}
	
	public String getInstructions() {
		return cake.getInstructions()+ factory.createFootballDecorations();
	}
	//Adds cost of chocolate buttercream to cake cost
	public double cost() {
		return 2.50 + cake.cost();
	}

}

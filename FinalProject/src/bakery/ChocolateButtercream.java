package bakery;

public class ChocolateButtercream extends Decoration {
	public Cake cake;
	IngrediantFactory factory = new IngrediantFactory();

	//Wraps Chocolate Buttercream around cake
	public ChocolateButtercream(Cake cake) {
		this.cake = cake;
	}
	
	//Adds Chocolate Buttercream to cake description
	public String getDescription() {
		return cake.getDescription()+ "with Chocolate Buttercream ";
	}
	
	public String getInstructions() {
		return cake.getInstructions()+ factory.createChocolateIcing();
	}
	//Adds cost of chocolate buttercream to cake cost
	public double cost() {
		return 2.00 + cake.cost();
	}

}

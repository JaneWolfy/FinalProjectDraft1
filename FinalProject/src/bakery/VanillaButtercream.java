package bakery;

public class VanillaButtercream extends Decoration {
	public Cake cake;
	IngrediantFactory factory = new IngrediantFactory();

	//Wraps Vanilla Buttercream around cake
	public VanillaButtercream(Cake cake) {
		this.cake = cake;
	}
	
	//Adds Vanilla Buttercream to cake description
	public String getDescription() {
		return cake.getDescription()+ "with Vanilla Buttercream ";
	}
	
	public String getInstructions() {
		return cake.getInstructions()+ factory.createVanillaIcing();
	}
	//Adds cost of Vanilla buttercream to cake cost
	public double cost() {
		return 1.80 + cake.cost();
	}

}

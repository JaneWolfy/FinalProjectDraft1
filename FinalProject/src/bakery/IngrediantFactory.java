package bakery;

public class IngrediantFactory {
	//Creates batter types
	public Batter createChocolateBatter() {
		return new ChocolateBatter();
	}
	
	public Batter createYellowBatter() {
		return new YellowBatter();
	}
	
	//Creates Icing types
	public Icing createChocolateIcing() {
		return new ChocolateIcing();
	}
	public Icing createVanillaIcing() {
		return new VanillaIcing();
	}
	
	//Creates Decoration types
	public Decorations createBirthdayDecorations() {
		return new BirthdayPack();
	}
	
	public Decorations createFootballDecorations() {
		return new FootballPackage();
	}
}

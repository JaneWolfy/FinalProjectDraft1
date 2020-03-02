 package bakery;

public class ChocolateBatter implements Batter {
	public String toString(){
		Oven oven = new Oven();
		//Creates instruction of chocolate
		return oven.setTemp(350)+"\nBake Chocolate cake batter at 350 for 35 minutes.\n"+ oven.turnOvenOff() +"\nLet Chocolate cake cool to room temp.\n";
	}
}

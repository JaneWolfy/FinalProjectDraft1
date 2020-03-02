package bakery;

public class YellowBatter implements Batter {
	public String toString(){
		Oven oven = new Oven();
		//Creates instruction of chocolate
		return oven.setTemp(350) + "\nBake Yellow cake batter at 350 for 35 minutes.\n" + oven.turnOvenOff() +"\nLet Yellow cake cool to room temp.\n";
	}
}

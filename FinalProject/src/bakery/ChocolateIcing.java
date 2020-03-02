package bakery;

public class ChocolateIcing implements Icing {
	public String toString() {
		Mixer mixer = new Mixer();
		//Creates instructions for chocolate icing
		return mixer.turnMixerON() + "\nAdd ingredients to mixer and mix.\n"+ mixer.turnOff() + "\nIce cake with Choclate Buttercream\n";
	}
}

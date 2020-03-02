package bakery;

public class VanillaIcing implements Icing {
	public String toString() {
		Mixer mixer = new Mixer();
		//Creates instructions for chocolate icing
		return mixer.turnMixerON() + "\nAdd ingrediants to mixer.\n" + mixer.turnOff()+"\nIce cake with Vanilla Buttercream\n";
	}
}

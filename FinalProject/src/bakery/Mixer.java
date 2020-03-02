package bakery;

public class Mixer {

	int speed = 0;
	
	public Mixer() {
	}
	
	//Turns mixer on to lowest setting
	public String turnMixerON() {
		speed = 1;
		return ("Mixer is on.");
	}
	
	//Checks mixer speed and if it can turns it up.
	public String increaseSpeed() {
		String result = "";
		if (speed >= 5) {
			result = ("Mixer cannot go any faster.");
		}
		else {
			speed++;
			result = "Mixer speed is now " + speed + ".";
		}
		return result;
	}
	
	//Checks mixer speed and if it can turns it down. Otherwise turns it off.
	public String decreaseSpeed() {
		String result = "";
		if (speed ==1) {
			speed--;
			result = ("Mixer is now off");
		}
		else if (speed == 0) {
			result = ("Mixer is now off");
		}
		else {
			speed--;
			result = ("Mixer speed is now " + speed + ".");
		}
		return result;
	}
	
	//turn mixer off
	public String turnOff() {
		speed = 0;
		return ("Mixer is off");
	}
	
	//Shows mixer speed
	public String getSpeed() {
		return ("Mixer speed is " + speed + ".");
	}

}

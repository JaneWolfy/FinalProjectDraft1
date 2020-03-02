package bakery;

public class Oven {
	int temp = 0;
	boolean power = false;
	boolean light = false;
			
	public Oven() {
	}
	
	public String setTemp(int temp2) {
		String result = "";
		//Checks if oven is off it its off oven preheats to entered temp. 
		if (power==false) {
			power = true;
			temp = temp2;
			result = "Oven is preheating to " + temp2 + " degrees.\n...\nOven is preheated.";
		}
		//If oven is on checks to see if current temp is different then entered temp. If is then changes it
		else if (temp != temp2) {
			temp=temp2;
			result = "Oven temperature is changing to " + temp2 + " degrees.\n...\nOven is preheated.";
		}
		//If oven is on and temp is same as enter temp it les the user know its ready.
		else {
			result = ("Oven is preheated.");
		}
		return result;
	}
	
	//Turns oven off and set temp to zero.
	public String turnOvenOff() {
		temp = 0;
		return "Oven is off.";
	}
	
	//Turn on oven light
	public String ovenLightOn() {
		light = true;
		return "Oven light is on.";
	}
	
	//Turns off oven light
	public String ovenLightOff() {
		light = false;
		return "Oven light is off.";
	}
}

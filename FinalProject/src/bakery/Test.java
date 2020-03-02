package bakery;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

class Test {

	@org.junit.jupiter.api.Test
	void test() {
		BakeryMenu menu = new BakeryMenu();
		CounterWorker bob = new CounterWorker(menu);
		assertTrue(bob.bakeryMenu.equals(menu));
		
		System.out.println("________________________________________________________________________________");
		Cake cake = new ChocolateCake();
		cake = new ChocolateButtercream(cake);
		cake = new BirthdayDecorations(cake);
		
		System.out.println(cake.getDescription());
		String description = "Chocolate Cake with Chocolate Buttercream with Candels and Icing Writing";
		assertTrue(cake.getDescription().equals(description));
		
		System.out.println(cake.getInstructions());
		assertTrue(cake.getInstructions().equals("Oven is preheating to 350 degrees.\n...\nOven is preheated.\nBake Chocolate cake batter at 350 for 35 minutes.\nOven is off.\nLet Chocolate cake cool to room temp.\nMixer is on.\nAdd ingredients to mixer and mix.\nMixer is off\nIce cake with Choclate Buttercream\nDecorate cake with Candel and Icing Writing\n"));
		
		System.out.println("Total: " + cake.cost());
		assertTrue(cake.cost()==24.0);

		
		Cake cake2 = new YellowCake();
		cake2 = new VanillaButtercream(cake2);
		cake2 = new FootballDecorations(cake2);
		
		System.out.println(cake2.getDescription());
		description="Yellow Cake with Vanilla Buttercream with Plastic Football and Icing Feild ";
		assertTrue(cake2.getDescription().equals(description));
		
		System.out.println(cake2.getInstructions());
		assertTrue(cake2.getInstructions().equals("Oven is preheating to 350 degrees.\n...\nOven is preheated.\nBake Yellow cake batter at 350 for 35 minutes.\nOven is off.\nLet Yellow cake cool to room temp.\nMixer is on.\nAdd ingrediants to mixer.\nMixer is off\nIce cake with Vanilla Buttercream\nDecorate cake with Icing Field then add platic football\n"));
		
		System.out.println("Total: " + cake2.cost());
		assertTrue(cake2.cost() == 22.3);
		
		Oven oven = new Oven();
		Mixer mixer = new Mixer();
		
		System.out.println(oven.setTemp(340));
		assertTrue(oven.temp==340);
		System.out.println(oven.setTemp(350));
		assertTrue(oven.temp==350);
		System.out.println(oven.ovenLightOn());
		assertTrue(oven.light);
		System.out.println(oven.ovenLightOff());
		assertTrue(!oven.light);
		System.out.println(oven.turnOvenOff());
		assertTrue(oven.temp==0);
		
		System.out.println(mixer.turnMixerON());
		assertTrue(mixer.speed==1);
		System.out.println(mixer.increaseSpeed());
		assertTrue(mixer.speed==2);
		System.out.println(mixer.increaseSpeed());
		assertTrue(mixer.speed==3);
		System.out.println(mixer.increaseSpeed());
		assertTrue(mixer.speed==4);
		System.out.println(mixer.increaseSpeed());
		assertTrue(mixer.speed==5);
		System.out.println(mixer.increaseSpeed());
		assertTrue(mixer.speed==5);
		System.out.println(mixer.decreaseSpeed());
		assertTrue(mixer.speed==4);
		System.out.println(mixer.decreaseSpeed());
		assertTrue(mixer.speed==3);
		System.out.println(mixer.decreaseSpeed());
		assertTrue(mixer.speed==2);
		System.out.println(mixer.turnOff());
		assertTrue(mixer.speed==0);
	}

}

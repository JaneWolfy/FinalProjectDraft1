package bakery;
import java.util.Scanner;

public class CounterWorker {
	BakeryMenu bakeryMenu;
	Cake cake;
	Scanner input = new Scanner(System.in);

	//Creates counter worker with menu
	public CounterWorker(BakeryMenu bakeryMenu) {
		this.bakeryMenu = bakeryMenu;
		System.out.println("Hello, here is our menu.");
		printMenu();
		System.out.println("What number one the menu would you like to purchase. Select 0 to exist.");
		Double num = input.nextDouble();
		order(num);
	}
	
	//prints out the menu
	public void printMenu() {
		BakeryIterator bakeryIterator = bakeryMenu.createIterator();
		
		System.out.println("Available Goods!");
		printMenu(bakeryIterator);
	}
	
	private void printMenu(MyIterator bakeryIterator) {
		int i = 1; 
		while(bakeryIterator.hasNext()) {
			MenuItem bakeryItem = bakeryIterator.next();
			System.out.println(i+ ": " + bakeryItem.getName() + ", $" + bakeryItem.getPrice()+ ": " + bakeryItem.getDescription());
			i++;
		}
	}
	
	public void order(Double num) {
		//Custom cake ordering
		String ord = "";
		int i=0;
		while(i<10) {
		if (num == 1) {
			//custom orders the batter type
			while(i ==0) {
				System.out.println("What type of batter would you like? Enter cancel to exit");
				while(ord.isBlank()) {
					ord = input.nextLine();
				}
				if (ord.equals( "Chocolate")) {
					cake = new ChocolateCake();
					i =1;
				}else if (ord.equals("Yellow")){
					cake = new YellowCake();
					i=1;
				}else if (ord.equals("cancel")){
					i=10;
				}else {
					System.out.println("I'm sorry that cake is not available");
				}
			}
			
			//Orders first decoration
			while (i==1) {
				System.out.println("What deocration would you like? Enter cancel to exit");
				ord = input.nextLine();
				if (ord.equals("Chocolate Buttercream")) {
					cake = new ChocolateButtercream(cake);
					i=2;
				}else if(ord.equals("Vanilla Buttercream")) {
					cake = new VanillaButtercream(cake);
					i=2;
				}else if (ord.equals("Birthday Decorations")) {
					cake = new BirthdayDecorations(cake);
					i=2;
				}else if (ord.equals("Football Decorations")) {
					cake = new FootballDecorations(cake);
					i=2;
				}else if (ord.equals("cancel")){
					i=10;
				}else {
					System.out.println("I'm sorry that decoration is not avaiable");
				}
			}
			
			
			//Orders second decoration
			while (i==2) {
				System.out.println("What second deocration would you like? Enter cancel to exit");
				ord = input.nextLine();
				if (ord.equals("Chocolate Buttercream")) {
					cake = new ChocolateButtercream(cake);
					i=3;
				}else if(ord.equals("Vanilla Buttercream")) {
					cake = new VanillaButtercream(cake);
					i=3;
				}else if (ord.equals("Birthday Decorations")) {
					cake = new BirthdayDecorations(cake);
					i=3;
				}else if (ord.equals("Football Decorations")) {
					cake = new FootballDecorations(cake);
					i=3;
				}else if (ord.equals("cancel")) {
					i=10;
				}else {
					System.out.println("I'm sorry that decoration is not avaiable");
				}
				System.out.println(cake.getDescription());
				System.out.println(cake.getInstructions());
				System.out.println("Total: " + cake.cost());
				i=10;
			}
		}else if(num ==2) {
			cake = new ChocolateCake();
			cake = new ChocolateButtercream(cake);
			System.out.println(cake.getDescription());
			System.out.println(cake.getInstructions());
			System.out.println("Total: " + cake.cost());
			i=10;
		}else if (num == 3) {
			cake = new YellowCake();
			cake = new VanillaButtercream(cake);
			cake = new BirthdayDecorations(cake);
			System.out.println(cake.getDescription());
			System.out.println(cake.getInstructions());
			System.out.println("Total: " + cake.cost());
			i=10;
		}else if(num == 0 || i==10) {
			System.out.println("Thank you and goodbye.");
			i=10;
		}else {
			System.out.println("That is not valid entry");
			System.out.println("What number one the menu would you like to purchase. Select 0 to exist.");
			num = input.nextDouble();
		}

		}
	}
}


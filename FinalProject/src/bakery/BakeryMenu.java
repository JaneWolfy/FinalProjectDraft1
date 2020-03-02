package bakery;

public class BakeryMenu implements Menu {
	int numberOfItems = 0;
	MenuItem[] menuItems;
	static final int MAX_ITEMS = 5;

	
	//creates the basic menu
	public BakeryMenu() {
		menuItems = new MenuItem[MAX_ITEMS];
		//Adds items to menu
		addItem("Custom", "A cake made to your specifications. Price will vary", 0);
		addItem("Double Chocolate Cake", "A chocolate cake with chcocolate frosting", 22.00);
		addItem("Vanilla Birthday Cake", "A vanilla cake with vanilla frosting and candels and decorations", 22.3);
		numberOfItems = 3;
	}
	
	//Adds an item to the menu. If the menu is full it says it can't be added.
	public void addItem(String name, String description, double price) {
		MenuItem menuItem = new MenuItem(name, description, price);
		if (numberOfItems >= MAX_ITEMS) {
			System.out.println("Sorry, menu is full! Can't add item to menu");
		} else {
			menuItems[numberOfItems] = menuItem;
			numberOfItems = numberOfItems + 1;
		}
	}
	
	//returns the array
	public MenuItem[] getMenuItems() {
		return menuItems;
	}
	

	@Override
	public BakeryIterator createIterator() {
		// TODO Auto-generated method stub
		return new BakeryIterator(menuItems);
	}
	
	public int getnumberOfItems() {
		return numberOfItems;
	}
	
	

}

package bakery;

public class MenuItem {
	String name;
	String description;
	double price;

	
	//Creates the item by inputing a name description and price
	public MenuItem(String name, String description, double price) {
		this.name = name;
		this.description = description;
		this.price = price;
	}
	
	//Returns name of menu item
	public String getName() {
		return name;
	}
	
	//Returns item description
	public String getDescription() {
		return description;
	}
	
	//Returns price of item
	public double getPrice() {
		return price;
	}
	
	//prints information on item
	public String toString(){
		return (name + " , $" + price + "\n" + description);
	}
	
}

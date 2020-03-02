package bakery;

public class BakeryIterator implements MyIterator {
	MenuItem[] items;
	int position = 0;
	
	//Creates the bakery iterator
	public  BakeryIterator(MenuItem[] items) {
		this.items = items;
	}
	
	//Checks if the list has a next item
	@Override
	public boolean hasNext() {
		if(position >= items.length || items[position] == null) {
			return false;
		}else {
			return true;
		}
	}

	//Gets next item in the list
	@Override
	public MenuItem next() {
		MenuItem menuItem = items[position];
		position = position +1;
		return menuItem;
	}

}

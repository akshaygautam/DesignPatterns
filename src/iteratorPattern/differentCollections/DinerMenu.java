package iteratorPattern.differentCollections;

import iteratorPattern.iterator.DinerMenuIterator;
import iteratorPattern.iterator.Iterator;

public class DinerMenu {
	private static final int MAX_ITEMS = 6;
	private int numberOfItems = 0;
	private MenuItem[] menuItems;
	
	public DinerMenu() {
		this.menuItems = new MenuItem[MAX_ITEMS];
		addItem("Vegetarian BLT", "(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99);
		addItem("BLT", "Bacon with lettuce & tomato on whole wheat", false, 2.99);
		addItem("Soup of the day", "Whatever soup", true, 3.79);
		addItem("Hotdog", "Hotdog with multi sauce", true, 2.99);
	
	}

	private void addItem(String name, String description, boolean vegetarian, double price) {
		MenuItem item = new MenuItem(name, description, vegetarian, price);
		if(numberOfItems >= MAX_ITEMS) System.out.println("Menu is full");
		else {
			menuItems[numberOfItems] = item;
			numberOfItems++;
		}
	}
	
	//Old without iterator
	public MenuItem[] getMenuItems() {
		return this.menuItems;
	}
	
	//New with iterator
	public Iterator getIterator() {
		return new DinerMenuIterator(this.menuItems);
	}
	
	//Other possible methods for array
}

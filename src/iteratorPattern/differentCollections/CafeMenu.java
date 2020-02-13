package iteratorPattern.differentCollections;

import java.util.HashMap;
import java.util.Iterator;


public class CafeMenu {
	private HashMap<String, MenuItem> menuItems = new HashMap();
	
	public CafeMenu() {
		addItem("Veggie Burger and Air Fries", 
				"Veggie burger with whole wheat bun, lettuce, tomatto and fries"
				, true, 4.77);
	}

	private void addItem(String name, String description, boolean vegetarian, double price) {
		MenuItem item = new MenuItem(name, description,vegetarian,price);
		this.menuItems.put(item.getName(),item);
	}
	//OLD without Iterator
	public HashMap<String,MenuItem> getMenuItems(){
		return this.menuItems;
	}
	
	public Iterator<MenuItem> getIterator(){
		return this.menuItems.values().iterator();
	}

}

package lifeBeforeMS.iteratorPattern.differentCollections;

import java.util.ArrayList;

import lifeBeforeMS.iteratorPattern.iterator.Iterator;
import lifeBeforeMS.iteratorPattern.iterator.PancakeHouseMenuIterator;

public class PancakeHouseMenu {
	private ArrayList<MenuItem> menuItems;

	public PancakeHouseMenu() {
		this.menuItems = new ArrayList<MenuItem>();
		this.menuItems.add(new MenuItem("K&B's Pancake breakfast", "Pancakes with scambled egg and toast", true, 2.99));
		this.menuItems.add(new MenuItem("Regular Pancake breakfast", "Pancakes with fried egg and toast", false, 2.99));
		this.menuItems.add(new MenuItem("Blueberry Pancake", "Pancakes with blueberry", true, 3.79));
		this.menuItems.add(new MenuItem("Waffels", "Waffels with your choice blueberry  or strawberry", true, 2.99));
	}
	
	public void addItem(String name, String description, boolean vegetarian, double price) {
		this.menuItems.add(new MenuItem(name, description, vegetarian, price));
	}
	
	// OLD without iterator
	public ArrayList<MenuItem> getMenuItems(){
		return this.menuItems;
	}
	// NEW with iterator
	public Iterator getIterator() {
		return new PancakeHouseMenuIterator(this.menuItems);
	}
	//Other possible methods for arrayList
}
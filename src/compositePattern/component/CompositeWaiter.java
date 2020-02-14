package compositePattern.component;

import java.util.Iterator;

public class CompositeWaiter {
	private MenuComponent allMenus;

	public CompositeWaiter(MenuComponent allMenus) {
		this.allMenus = allMenus;	
	}
	
	public void printMenus() {
		this.allMenus.print();
	}
	
	public void printVegMenu() {
		Iterator<MenuComponent> iterator = this.allMenus.createIterator();
		System.out.print("\n Veg menu\n----------");
		while(iterator.hasNext()) {
			MenuComponent component = iterator.next();
			try {
				if(component.isVegetarian())
					component.print();
			}catch (UnsupportedOperationException e) {
			}
		}
	}
}

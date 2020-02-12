package iteratorPattern;

import java.util.ArrayList;

import iteratorPattern.differentCollections.DinerMenu;
import iteratorPattern.differentCollections.MenuItem;
import iteratorPattern.differentCollections.PancakeHouseMenu;
import iteratorPattern.iterator.Iterator;

public class Waiter {
	private PancakeHouseMenu pancakeHouseMenu;
	private DinerMenu dinerMenu;

	public Waiter(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
		this.dinerMenu = dinerMenu;
		this.pancakeHouseMenu = pancakeHouseMenu;
	}
	
	public void printMenu() {
		ArrayList<MenuItem> panMenuItems = this.pancakeHouseMenu.getMenuItems();
		MenuItem[] dinMenuItems = this.dinerMenu.getMenuItems();
		//Just because of different collections,
		//Two loops are running even though they are of same base type "MenuItem"
		System.out.println("------Pancake----");
		for(MenuItem item: panMenuItems) {
			System.out.print(item.getName());
			System.out.println("\t\t"+item.getPrice());
			System.out.println("\t"+item.getDescription());;
		}
		System.out.println("------Diner----");
		for(MenuItem item: dinMenuItems) {
			if(item == null) continue;
			System.out.print(item.getName());
			System.out.println("\t\t"+item.getPrice());
			System.out.println("\t"+item.getDescription());;
		}
	}
	
	public void printMenuWithIterator() {
		Iterator panIterator = this.pancakeHouseMenu.getIterator();
		Iterator dinIterator = this.dinerMenu.getIterator();
		printMenu(panIterator);
		printMenu(dinIterator);
	}

	private void printMenu(Iterator iterator) {
		while(iterator.hasNext()) {
			MenuItem item = iterator.next();
			System.out.print(item.getName());
			System.out.println(" => Price ("+item.getPrice()+ ")\t\t-- "+item.getDescription());;
		}
	}

}

package iteratorPattern;

import java.util.ArrayList;

import iteratorPattern.differentCollections.CafeMenu;
import iteratorPattern.differentCollections.DinerMenu;
import iteratorPattern.differentCollections.MenuItem;
import iteratorPattern.differentCollections.PancakeHouseMenu;
import iteratorPattern.iterator.Iterator;

public class Waiter {
	private PancakeHouseMenu pancakeHouseMenu;
	private DinerMenu dinerMenu;
	private CafeMenu cafeMenu;

	public Waiter(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu, CafeMenu cafeMenu) {
		this.dinerMenu = dinerMenu;
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.cafeMenu = cafeMenu;
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
		/*
		 * Cool now we can utilize same method to iterate different collections
		 */
		java.util.Iterator<MenuItem> panIterator = this.pancakeHouseMenu.getIterator();
		java.util.Iterator<MenuItem> dinIterator = this.dinerMenu.getIterator();
		java.util.Iterator<MenuItem> cafeIterator = this.cafeMenu.getIterator();
		
		// But this multiple call is also a pain to my eyes, Look for composite pattern for solution
		printMenu(panIterator);
		printMenu(dinIterator);
		printMenu(cafeIterator);
	}

	private void printMenu(java.util.Iterator<MenuItem> iterator) {
		while(iterator.hasNext()) {
			MenuItem item = iterator.next();
			System.out.print(item.getName());
			System.out.println(" => Price ("+item.getPrice()+ ")\t\t-- "+item.getDescription());;
		}
	}

}

package iteratorPattern;

import iteratorPattern.differentCollections.CafeMenu;
import iteratorPattern.differentCollections.DinerMenu;
import iteratorPattern.differentCollections.PancakeHouseMenu;

public class IteratorTest {

	public static void main(String[] args) {
		Waiter waiter = new Waiter(new PancakeHouseMenu(), new DinerMenu(), new CafeMenu());
//		waiter.printMenu();
		waiter.printMenuWithIterator();
	}

}

package lifeBeforeMS.iteratorPattern;

import lifeBeforeMS.iteratorPattern.differentCollections.CafeMenu;
import lifeBeforeMS.iteratorPattern.differentCollections.DinerMenu;
import lifeBeforeMS.iteratorPattern.differentCollections.PancakeHouseMenu;

public class IteratorTest {

	public static void main(String[] args) {
		Waiter waiter = new Waiter(new PancakeHouseMenu(), new DinerMenu(), new CafeMenu());
//		waiter.printMenu();
		waiter.printMenuWithIterator();
	}

}

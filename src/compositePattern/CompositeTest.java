package compositePattern;

import compositePattern.component.CompositeWaiter;
import compositePattern.component.MenuComponent;
import compositePattern.differentCollections.copyIterator.Menu;
import compositePattern.differentCollections.copyIterator.MenuItem;

public class CompositeTest {

	public static void main(String[] args) {
		MenuComponent allMenu = prepareAllMenus();
		CompositeWaiter waiter = new CompositeWaiter(allMenu);
		waiter.printMenus();
		waiter.printVegMenu();

	}

	private static MenuComponent prepareAllMenus() {
		MenuComponent pancakeMenu = new Menu("PANCAKE MENU", "BREAKFAST");
		MenuComponent dinerMenu = new Menu("DINER MENU", "DINER");
		MenuComponent cafeMenu = new Menu("CAFE MENU", "BEVERAGE");
		MenuComponent desertMenu = new Menu("DESERT MENU", "DESRTS");
		MenuComponent allMenu = new Menu("ALL MENU", "Composite MENU");
		allMenu.add(pancakeMenu);
		allMenu.add(desertMenu);
		allMenu.add(cafeMenu);
		allMenu.add(dinerMenu);

		dinerMenu
				.add(new MenuItem("Vegetarian BLT", "(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99));
		dinerMenu.add(new MenuItem("BLT", "Bacon with lettuce & tomato on whole wheat", false, 2.99));
		dinerMenu.add(new MenuItem("Soup of the day", "Whatever soup", true, 3.79));
		dinerMenu.add(new MenuItem("Hotdog", "Hotdog with multi sauce", true, 2.99));

		pancakeMenu.add(new MenuItem("K&B's Pancake breakfast", "Pancakes with scambled egg and toast", true, 2.99));
		pancakeMenu.add(new MenuItem("Regular Pancake breakfast", "Pancakes with fried egg and toast", false, 2.99));
		pancakeMenu.add(new MenuItem("Blueberry Pancake", "Pancakes with blueberry", true, 3.79));
		pancakeMenu.add(new MenuItem("Waffels", "Waffels with your choice blueberry  or strawberry", true, 2.99));

		cafeMenu.add(new MenuItem("Veggie Burger and Air Fries",
				"Veggie burger with whole wheat bun, lettuce, tomatto and fries", true, 4.77));
		
		desertMenu.add(new MenuItem("Gulab Jamun", "Softserve gulab jamun with ice cream", true, 3.2));

		return allMenu;
	}

}

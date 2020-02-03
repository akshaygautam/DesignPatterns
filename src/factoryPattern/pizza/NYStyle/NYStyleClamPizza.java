package factoryPattern.pizza.NYStyle;

import factoryPattern.pizza.Pizza;

public class NYStyleClamPizza extends Pizza {
	public NYStyleClamPizza() {
		this.dough = "thin crust";
		this.name = "New York style clam pizza";
		this.sauce = "garlic tomato sauce";
		this.toppings.add("Shradded mozzarella cheese");
		this.toppings.add("Sun Dried tomato");
		this.toppings.add("Diced bell peppers");
		this.toppings.add("Chopped olives");
		this.toppings.add("Diced onions");
	}
	@Override
	public void cut() {
		System.out.println("Cutting it into square slices");
	}

}

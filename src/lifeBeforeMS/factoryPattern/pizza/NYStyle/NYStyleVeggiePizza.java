package lifeBeforeMS.factoryPattern.pizza.NYStyle;

import lifeBeforeMS.factoryPattern.pizza.Pizza;

public class NYStyleVeggiePizza extends Pizza {

	public NYStyleVeggiePizza() {
		this.dough = "thin crust";
		this.name = "New york style veggie pizza";
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

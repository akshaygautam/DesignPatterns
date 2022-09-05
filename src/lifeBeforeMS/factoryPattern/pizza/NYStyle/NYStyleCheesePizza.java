package lifeBeforeMS.factoryPattern.pizza.NYStyle;

import lifeBeforeMS.factoryPattern.pizza.Pizza;

public class NYStyleCheesePizza extends Pizza {

	public NYStyleCheesePizza() {
		this.dough = "thin crust";
		this.name = "New York style cheese pizza";
		this.sauce = "garlic tomato sauce";
		this.toppings.add("Shradded mozzarella cheese");
		this.toppings.add("chadder dice layer");
	}
	@Override
	public void cut() {
		System.out.println("Cutting it into square slices");
	}

}

package lifeBeforeMS.factoryPattern.pizza.ChicagoStyle;

import lifeBeforeMS.factoryPattern.pizza.Pizza;

public class ChicagoStyleCheesePizza extends Pizza{
	public ChicagoStyleCheesePizza() {
		this.dough = "Extra thick crust";
		this.name = "Chicago style cheese pizza";
		this.sauce = "Plum tomato sauce";
		this.toppings.add("Shradded mozzarella cheese");
	}
	
	@Override
	public void cut() {
		System.out.println("Cutting it into slices in chicago style");
	}
}

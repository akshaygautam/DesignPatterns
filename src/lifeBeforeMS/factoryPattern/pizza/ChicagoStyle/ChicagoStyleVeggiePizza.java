package lifeBeforeMS.factoryPattern.pizza.ChicagoStyle;

import lifeBeforeMS.factoryPattern.pizza.Pizza;

public class ChicagoStyleVeggiePizza extends Pizza {
	public ChicagoStyleVeggiePizza() {
		this.dough = "Extra thick crust";
		this.name = "Chicago style veggie pizza";
		this.sauce = "Plum tomato sauce";
		this.toppings.add("Shradded mozzarella cheese");
		this.toppings.add("Sun Dried tomato");
		this.toppings.add("Diced bell peppers");
		this.toppings.add("Chopped olives");
		this.toppings.add("Diced onions");
	}
	
	@Override
	public void cut() {
		System.out.println("Cutting it into slices in chicago style");
	}
}

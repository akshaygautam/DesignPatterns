package lifeBeforeMS.factoryPattern.pizza.simplePizza;

import lifeBeforeMS.factoryPattern.pizza.Pizza;

public class CheesePizza extends Pizza {

	public CheesePizza() {
		this.dough = "basic crust";
		this.name = "simple cheese pizza";
		this.sauce = "pizza sauce";
		this.toppings.add("Shradded mozzarella cheese");
		this.toppings.add("Sun Dried tomato");
		this.toppings.add("Diced bell peppers");
		this.toppings.add("Diced onions");
	}

}

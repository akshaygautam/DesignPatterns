package lifeBeforeMS.factoryPattern.pizza.simplePizza;

import lifeBeforeMS.factoryPattern.pizza.Pizza;

public class ClamPizza extends Pizza {

	public ClamPizza() {
		this.dough = "basic crust";
		this.name = "simple clam pizza";
		this.sauce = "pizza sauce";
		this.toppings.add("Shradded mozzarella cheese");
		this.toppings.add("Sun Dried tomato");
		this.toppings.add("Diced bell peppers");
		this.toppings.add("Diced onions");
	}

}

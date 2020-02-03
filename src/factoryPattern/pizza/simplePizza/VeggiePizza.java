package factoryPattern.pizza.simplePizza;

import factoryPattern.pizza.Pizza;

public class VeggiePizza extends Pizza {

	public VeggiePizza() {
		this.dough = "basic crust";
		this.name = "simple veggie pizza";
		this.sauce = "pizza sauce";
		this.toppings.add("Shradded mozzarella cheese");
		this.toppings.add("Sun Dried tomato");
		this.toppings.add("Diced bell peppers");
		this.toppings.add("Diced onions");
	}

}

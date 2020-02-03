package factoryPattern.factoryMethod;

import factoryPattern.pizza.Pizza;
import factoryPattern.pizza.NYStyle.*;

public class NYStylePizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		if(type.equalsIgnoreCase("cheese"))
			pizza = new NYStyleCheesePizza();
		if(type.equalsIgnoreCase("veggie"))
			pizza = new NYStyleVeggiePizza();
		if(type.equalsIgnoreCase("clam"))
			pizza = new NYStyleClamPizza();
		return pizza;
	}

}

package factoryPattern.simpleFactory;

import factoryPattern.pizza.*;
import factoryPattern.pizza.simplePizza.*;

public class SimplePizzaFactory {

	public Pizza createPizza(String type) {
		Pizza pizza = null;
		if(type.equalsIgnoreCase("cheese"))
			pizza = new CheesePizza();
		if(type.equalsIgnoreCase("veggie"))
			pizza = new VeggiePizza();
		if(type.equalsIgnoreCase("clam"))
			pizza = new ClamPizza();
		return pizza;
	}
}

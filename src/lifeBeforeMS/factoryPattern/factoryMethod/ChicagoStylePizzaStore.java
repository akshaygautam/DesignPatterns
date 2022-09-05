package lifeBeforeMS.factoryPattern.factoryMethod;

import lifeBeforeMS.factoryPattern.pizza.Pizza;
import lifeBeforeMS.factoryPattern.pizza.ChicagoStyle.*;
public class ChicagoStylePizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		if(type.equalsIgnoreCase("cheese"))
			pizza = new ChicagoStyleCheesePizza();
		if(type.equalsIgnoreCase("veggie"))
			pizza = new ChicagoStyleVeggiePizza();
		if(type.equalsIgnoreCase("clam"))
			pizza = new ChicagoStyleClamPizza();
		return pizza;
	}

}

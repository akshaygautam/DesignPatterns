package factoryPattern.simpleFactory;

import factoryPattern.pizza.Pizza;

public class SimplePizzaStore {

	SimplePizzaFactory pizzaFactory;
	public SimplePizzaStore(SimplePizzaFactory pizzaFactory) {
		this.pizzaFactory = pizzaFactory;
	}
	
	public Pizza orderPizza(String type) {
		Pizza pizza = null;
		pizza = this.pizzaFactory.createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}

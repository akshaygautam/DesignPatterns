package factoryPattern;

import factoryPattern.factoryMethod.ChicagoStylePizzaStore;
import factoryPattern.factoryMethod.NYStylePizzaStore;
import factoryPattern.factoryMethod.PizzaStore;
import factoryPattern.simpleFactory.SimplePizzaFactory;
import factoryPattern.simpleFactory.SimplePizzaStore;

public class TestFactoryPattern {

	public static void main(String[] args) {
//		testSimpleFactory();
		testFactoryMethod();
	}

	//Dependent on factory
	private static void testSimpleFactory() {
		SimplePizzaFactory pizzaFactory = new SimplePizzaFactory();
		SimplePizzaStore pizzaStore = new SimplePizzaStore(pizzaFactory);
		pizzaStore.orderPizza("cheese");
		pizzaStore.orderPizza("veggie");
	}
	
	//Dependent only on Pizza
	private static void testFactoryMethod() {
		PizzaStore nyPizzaStore = new NYStylePizzaStore();
//		nyPizzaStore.orderPizza("cheese");
//		nyPizzaStore.orderPizza("veggie");
		
		PizzaStore chicagoPizzaStore = new ChicagoStylePizzaStore();
		chicagoPizzaStore.orderPizza("clam");
		chicagoPizzaStore.orderPizza("veggie");
	}

}

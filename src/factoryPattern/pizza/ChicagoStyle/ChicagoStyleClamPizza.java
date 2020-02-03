package factoryPattern.pizza.ChicagoStyle;

import factoryPattern.pizza.Pizza;

public class ChicagoStyleClamPizza extends Pizza {

	public ChicagoStyleClamPizza() {
		this.dough = "Extra thick crust";
		this.name = "Chicago style clam  pizza";
		this.sauce = "basil tomato sauce";
		this.toppings.add("Shradded mozzarella cheese");
		this.toppings.add("jalepeno");
	}
	
	@Override
	public void cut() {
		System.out.println("Cutting it into slices in chicago style");
	}

}

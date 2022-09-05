package lifeBeforeMS.factoryPattern.abstractFactory.ingredients.Factory;

import lifeBeforeMS.factoryPattern.abstractFactory.PizzaIngredientFactory;
import lifeBeforeMS.factoryPattern.abstractFactory.ingredients.*;
import lifeBeforeMS.factoryPattern.abstractFactory.ingredients.concreteIngredients.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory{

	@Override
	public Dough createDough() {
		return new ThinCrust();
	}

	@Override
	public Sauce createSauce() {
		return new MarinaraSauce();
	}

	@Override
	public Cheese createCheese() {
		return new ReggianoCheese();
	}

	@Override
	public Veggies[] createVeggies() {
		Veggies veggies[] = {new Garlic(), new Onion(), new Mushroom(), new RedPepper(), new BellPepper() };
		return null;
	}

	@Override
	public Clams createClams() {
		return new FreshClams();
	}

}

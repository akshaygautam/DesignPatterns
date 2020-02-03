package factoryPattern.abstractFactory;

import factoryPattern.abstractFactory.ingredients.Cheese;
import factoryPattern.abstractFactory.ingredients.Clams;
import factoryPattern.abstractFactory.ingredients.Dough;
import factoryPattern.abstractFactory.ingredients.Sauce;
import factoryPattern.abstractFactory.ingredients.Veggies;

public interface PizzaIngredientFactory {
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Veggies[] createVeggies();
	public Clams createClams();
}

package lifeBeforeMS.factoryPattern.abstractFactory;

import lifeBeforeMS.factoryPattern.abstractFactory.ingredients.Cheese;
import lifeBeforeMS.factoryPattern.abstractFactory.ingredients.Clams;
import lifeBeforeMS.factoryPattern.abstractFactory.ingredients.Dough;
import lifeBeforeMS.factoryPattern.abstractFactory.ingredients.Sauce;
import lifeBeforeMS.factoryPattern.abstractFactory.ingredients.Veggies;

public interface PizzaIngredientFactory {
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Veggies[] createVeggies();
	public Clams createClams();
}

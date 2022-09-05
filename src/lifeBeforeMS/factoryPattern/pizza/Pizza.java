package lifeBeforeMS.factoryPattern.pizza;

import java.util.ArrayList;

public abstract class Pizza {
	protected String name;
	protected String dough;
	protected String sauce;
	protected ArrayList<String> toppings = new ArrayList<String>();
	
	public void prepare() {
		System.out.println("Preparing ----- "+ this.name);
		System.out.println("Tossing dough ----- "+ this.dough);
		System.out.println("Applying sauce ----- "+ this.sauce);
		for(String topping : this.toppings)
			System.out.println("Adding topping ----- "+ topping);
	}
	
	public void bake() {
		System.out.println("Baking your pizza");
	}
	
	public void cut() {
		System.out.println("Cutting it into slices");
	}
	
	public void box() {
		System.out.println("Packed, Here you go enjoy!");
		System.out.println("-----------------------------------------\n\n");
	}
}

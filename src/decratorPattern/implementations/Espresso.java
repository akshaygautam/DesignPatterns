package decratorPattern.implementations;

import java.util.List;

import decratorPattern.interfaces.Beverage;

public class Espresso implements Beverage {

	@Override
	public List<String> getDescription() {
		this.description.add("Espresso");
		return this.description;
	}

	@Override
	public double cost() {
		return 2.5;
	}

}

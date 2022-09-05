package lifeBeforeMS.decratorPattern.implementations;

import java.util.List;

import lifeBeforeMS.decratorPattern.interfaces.Beverage;

public class HouseBlend implements Beverage {

	@Override
	public List<String> getDescription() {
		this.description.add("House blend");
		return this.description;
	}

	@Override
	public double cost() {
		return 1.8;
	}

}

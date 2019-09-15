package decratorPattern.implementations;

import java.util.List;

import decratorPattern.interfaces.Beverage;
import decratorPattern.interfaces.CondimentDecrator;

public class Mocha implements CondimentDecrator {
	Beverage beverage;
	
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public List<String> getDescription() {
		this.description.add("Mocha");
		return description;
	}

	@Override
	public double cost() {
		return this.beverage.cost() + 2.3;
	}

}

package decratorPattern.implementations;

import java.util.List;

import decratorPattern.interfaces.Beverage;
import decratorPattern.interfaces.CondimentDecrator;

public class Whip implements CondimentDecrator {
	Beverage beverage;
	
	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public List<String> getDescription() {
		this.description.add("Whip");
		return this.description;
	}

	@Override
	public double cost() {
		return this.beverage.cost() + 1.4;
	}

}

package lifeBeforeMS.decratorPattern.implementations;

import java.util.List;

import lifeBeforeMS.decratorPattern.interfaces.Beverage;
import lifeBeforeMS.decratorPattern.interfaces.CondimentDecrator;

public class Milk implements CondimentDecrator {
	Beverage beverage;
	
	public Milk(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public List<String> getDescription() {
		this.description.add("Milk");
		return this.description;
	}

	@Override
	public double cost() {
		return this.beverage.cost() + 0.3;
	}

}

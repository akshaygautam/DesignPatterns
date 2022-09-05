package lifeBeforeMS.decratorPattern.implementations;

import java.util.List;

import lifeBeforeMS.decratorPattern.interfaces.Beverage;
import lifeBeforeMS.decratorPattern.interfaces.CondimentDecrator;

public class Soy implements CondimentDecrator {
	Beverage beverage;
	
	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public List<String> getDescription() {
		this.description.add("Soy");
		return this.description;
	}

	@Override
	public double cost() {
		return this.beverage.cost() + 0.2;
	}

}

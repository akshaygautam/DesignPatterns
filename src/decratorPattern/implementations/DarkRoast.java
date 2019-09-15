package decratorPattern.implementations;

import java.util.List;

import decratorPattern.interfaces.Beverage;

public class DarkRoast implements Beverage {

	@Override
	public List<String> getDescription() {
		this.description.add("Dark rost");
		return this.description;
	}
	@Override
	public double cost() {
		return 2.2;
	}

}

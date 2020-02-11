package templateMethodPattern.beverages;

import templateMethodPattern.template.CaffeineBeverage;

public class Coffee extends CaffeineBeverage {

	@Override
	protected void addCondiments() {
		System.out.println("Adding Milk and suggar");
	}

	@Override
	protected void brew() {
		System.out.println("Brewing coffee in boiling water");
	}

}

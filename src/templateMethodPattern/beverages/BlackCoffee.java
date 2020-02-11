package templateMethodPattern.beverages;

import java.util.Random;

import templateMethodPattern.template.CaffeineBeverage;

public class BlackCoffee extends CaffeineBeverage{
	/**
	 * This method will act as a hook to alter the flow of algorithm
	 */
	@Override
	protected boolean customeWantsCondiments() {
		Random r  = new Random();
		return r.nextInt() %2 == 0;
	}

	@Override
	protected void addCondiments() {
		System.out.println("Adding cocoa and sugar");
	}

	@Override
	protected void brew() {
		System.out.println("Dripping coffee through filter");
	}

}

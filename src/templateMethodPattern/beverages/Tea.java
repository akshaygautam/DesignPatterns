package templateMethodPattern.beverages;

import templateMethodPattern.template.CaffeineBeverage;

public class Tea extends CaffeineBeverage{

	@Override
	protected void addCondiments() {
		System.out.println("Adding lemon and ginger drops");
	}

	@Override
	protected void brew() {
		System.out.println("Steeping tea in water");
	}

}

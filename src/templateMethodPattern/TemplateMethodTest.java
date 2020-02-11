package templateMethodPattern;

import templateMethodPattern.beverages.BlackCoffee;
import templateMethodPattern.beverages.Coffee;
import templateMethodPattern.beverages.Tea;
import templateMethodPattern.template.CaffeineBeverage;

public class TemplateMethodTest {

	public static void main(String[] args) {
		CaffeineBeverage coffee = new Coffee();
		coffee.prepareRecipe();
		System.out.println("-----------");
		CaffeineBeverage tea = new Tea();
		tea.prepareRecipe();
		System.out.println("-----------");
		CaffeineBeverage blackCoffee = new BlackCoffee();
		blackCoffee.prepareRecipe();
	}

}

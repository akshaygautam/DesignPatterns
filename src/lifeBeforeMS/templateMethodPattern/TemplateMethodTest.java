package lifeBeforeMS.templateMethodPattern;

import lifeBeforeMS.templateMethodPattern.beverages.BlackCoffee;
import lifeBeforeMS.templateMethodPattern.beverages.Coffee;
import lifeBeforeMS.templateMethodPattern.beverages.Tea;
import lifeBeforeMS.templateMethodPattern.template.CaffeineBeverage;

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

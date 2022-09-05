package lifeBeforeMS.decratorPattern;

import lifeBeforeMS.decratorPattern.implementations.DarkRoast;
import lifeBeforeMS.decratorPattern.implementations.Espresso;
import lifeBeforeMS.decratorPattern.implementations.HouseBlend;
import lifeBeforeMS.decratorPattern.implementations.Milk;
import lifeBeforeMS.decratorPattern.implementations.Mocha;
import lifeBeforeMS.decratorPattern.implementations.Soy;
import lifeBeforeMS.decratorPattern.interfaces.Beverage;

public class DecoratorTestMain {

	public static void main(String[] args) {
		Beverage espresso = new Espresso();
		System.out.println(espresso.getDescription()+" "+"$"+espresso.cost());
		
		Beverage houseblend = new HouseBlend();

		houseblend = new Milk(houseblend);
		houseblend = new Mocha(houseblend);
		houseblend = new Milk(houseblend);
		houseblend = new Mocha(houseblend);
		System.out.println(houseblend.getDescription()+" "+"$"+houseblend.cost());
		
		Beverage Darkrost = new DarkRoast();
		Darkrost = new Mocha(Darkrost);
		Darkrost = new Milk(Darkrost);
		Darkrost = new Soy(Darkrost);
		System.out.println(Darkrost.getDescription()+" "+"$"+Darkrost.cost());
	}

}

package decratorPattern;

import decratorPattern.implementations.DarkRoast;
import decratorPattern.implementations.Espresso;
import decratorPattern.implementations.HouseBlend;
import decratorPattern.implementations.Milk;
import decratorPattern.implementations.Mocha;
import decratorPattern.implementations.Soy;
import decratorPattern.interfaces.Beverage;

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

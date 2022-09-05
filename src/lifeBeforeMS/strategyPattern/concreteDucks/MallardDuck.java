package lifeBeforeMS.strategyPattern.concreteDucks;

import lifeBeforeMS.strategyPattern.Duck;
import lifeBeforeMS.strategyPattern.behaviouralInterfaces.impls.FlyWithWings;
import lifeBeforeMS.strategyPattern.behaviouralInterfaces.impls.Quack;

public class MallardDuck extends Duck{
	public MallardDuck() {

		flyBehaviour = new FlyWithWings();
		quackBehaviour = new Quack();

	}
	
	@Override
	public void display() {
		System.out.println("Looking like mallard!!");
	}
	
}

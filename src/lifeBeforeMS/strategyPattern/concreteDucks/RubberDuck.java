package lifeBeforeMS.strategyPattern.concreteDucks;

import lifeBeforeMS.strategyPattern.Duck;
import lifeBeforeMS.strategyPattern.behaviouralInterfaces.impls.FlyNoWay;
import lifeBeforeMS.strategyPattern.behaviouralInterfaces.impls.Squeak;

public class RubberDuck extends Duck {

	public RubberDuck() {
		flyBehaviour = new FlyNoWay();
		quackBehaviour = new Squeak();
	}
	
	@Override
	public void display() {
		System.out.println("Classic yellow rubber duck");
	}

}

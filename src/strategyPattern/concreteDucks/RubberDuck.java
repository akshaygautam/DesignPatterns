package strategyPattern.concreteDucks;

import strategyPattern.Duck;
import strategyPattern.behaviouralInterfaces.impls.FlyNoWay;
import strategyPattern.behaviouralInterfaces.impls.Squeak;

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

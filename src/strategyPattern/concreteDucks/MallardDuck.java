package strategyPattern.concreteDucks;

import strategyPattern.Duck;
import strategyPattern.behaviouralInterfaces.impls.FlyWithWings;
import strategyPattern.behaviouralInterfaces.impls.Quack;

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

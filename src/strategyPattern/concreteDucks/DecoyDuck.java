package strategyPattern.concreteDucks;

import strategyPattern.Duck;
import strategyPattern.behaviouralInterfaces.impls.FlyNoWay;
import strategyPattern.behaviouralInterfaces.impls.ImMute;

public class DecoyDuck extends Duck {

	public DecoyDuck() {
		flyBehaviour = new FlyNoWay();
		quackBehaviour = new ImMute();
	}
	
	@Override
	public void display() {
		System.out.println("Sleak wooden finish :)");
	}
	
}

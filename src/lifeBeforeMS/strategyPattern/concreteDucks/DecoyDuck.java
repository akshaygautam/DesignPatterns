package lifeBeforeMS.strategyPattern.concreteDucks;

import lifeBeforeMS.strategyPattern.Duck;
import lifeBeforeMS.strategyPattern.behaviouralInterfaces.impls.FlyNoWay;
import lifeBeforeMS.strategyPattern.behaviouralInterfaces.impls.ImMute;

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

package strategyPattern.behaviouralInterfaces.impls;

import strategyPattern.behaviouralInterfaces.FlyBehaviour;

public class FlyNoWay implements FlyBehaviour {

	@Override
	public void fly() {
		System.out.println("I can't fly");
	}

}

package strategyPattern.behaviouralInterfaces.impls;

import strategyPattern.behaviouralInterfaces.FlyBehaviour;

public class FlyWithWings implements FlyBehaviour {

	@Override
	public void fly() {
		System.out.println("I'm Flyingggg higgghhhhhh!");
	}

}

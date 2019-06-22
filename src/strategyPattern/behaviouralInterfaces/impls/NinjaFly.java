package strategyPattern.behaviouralInterfaces.impls;

import strategyPattern.behaviouralInterfaces.FlyBehaviour;

public class NinjaFly implements FlyBehaviour {

	@Override
	public void fly() {
		System.out.println("I'm a ninja duck...... fly fly fly fly!!!!");
	}

}

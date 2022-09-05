package lifeBeforeMS.strategyPattern.behaviouralInterfaces.impls;

import lifeBeforeMS.strategyPattern.behaviouralInterfaces.FlyBehaviour;

public class NinjaFly implements FlyBehaviour {

	@Override
	public void fly() {
		System.out.println("I'm a ninja duck...... fly fly fly fly!!!!");
	}

}

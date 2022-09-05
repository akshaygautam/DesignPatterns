package lifeBeforeMS.strategyPattern.behaviouralInterfaces.impls;

import lifeBeforeMS.strategyPattern.behaviouralInterfaces.QuackBehaviour;

public class Quack implements QuackBehaviour {

	@Override
	public void quack() {
		System.out.println("Quack! Quack!");
	}

}

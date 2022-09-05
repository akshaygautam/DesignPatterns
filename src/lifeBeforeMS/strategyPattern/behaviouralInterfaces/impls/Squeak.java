package lifeBeforeMS.strategyPattern.behaviouralInterfaces.impls;

import lifeBeforeMS.strategyPattern.behaviouralInterfaces.QuackBehaviour;

public class Squeak implements QuackBehaviour {

	@Override
	public void quack() {
		System.out.println("Squeeeeak!!!!");
	}

}

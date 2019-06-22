package strategyPattern.behaviouralInterfaces.impls;

import strategyPattern.behaviouralInterfaces.QuackBehaviour;

public class Squeak implements QuackBehaviour {

	@Override
	public void quack() {
		System.out.println("Squeeeeak!!!!");
	}

}

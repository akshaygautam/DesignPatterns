package strategyPattern.behaviouralInterfaces.impls;

import strategyPattern.behaviouralInterfaces.QuackBehaviour;

public class Quack implements QuackBehaviour {

	@Override
	public void quack() {
		System.out.println("Quack! Quack!");
	}

}

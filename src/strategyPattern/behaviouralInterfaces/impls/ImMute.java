package strategyPattern.behaviouralInterfaces.impls;

import strategyPattern.behaviouralInterfaces.QuackBehaviour;

public class ImMute implements QuackBehaviour {

	@Override
	public void quack() {
		System.out.println("<<  Silence  >>");
	}

}

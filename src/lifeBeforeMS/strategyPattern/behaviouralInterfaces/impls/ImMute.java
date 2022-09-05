package lifeBeforeMS.strategyPattern.behaviouralInterfaces.impls;

import lifeBeforeMS.strategyPattern.behaviouralInterfaces.QuackBehaviour;

public class ImMute implements QuackBehaviour {

	@Override
	public void quack() {
		System.out.println("<<  Silence  >>");
	}

}

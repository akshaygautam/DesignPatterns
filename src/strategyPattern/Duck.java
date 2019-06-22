package strategyPattern;

import strategyPattern.behaviouralInterfaces.FlyBehaviour;
import strategyPattern.behaviouralInterfaces.QuackBehaviour;

public abstract class Duck {
	
	protected FlyBehaviour flyBehaviour;
	protected QuackBehaviour quackBehaviour;
	public Duck() {}

	public void swim() {
		System.out.println("All ducks swim even decoy ones");
	}
	public abstract void display();
	
	public void performQuack() {
		quackBehaviour.quack();
	}
	public void performFly() {
		flyBehaviour.fly();
	}
	public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
		this.flyBehaviour = flyBehaviour;
	}
	public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
		this.quackBehaviour = quackBehaviour;
	}
}

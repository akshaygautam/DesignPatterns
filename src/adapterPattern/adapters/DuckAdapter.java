package adapterPattern.adapters;

import adapterPattern.adaptee.Turkey;
import strategyPattern.Duck;

/**
 * @author akshay
 *	The adapter implements the target interface and holds an instance of the Adaptee.
 *	Here Duck is connected to Turkey. or Duck disguised as a Turkey. 
 */
public class DuckAdapter implements Turkey{
	private Duck duck;
	
	public DuckAdapter(Duck duck) {
		this.duck = duck;
		this.duck.setFlyBehaviour(()->{System.out.println("Duck is flying");});
		this.duck.setQuackBehaviour(()->{System.out.println("Quacking......");});
	}
	@Override
	public void gobble() {
		this.duck.performQuack();
	}

	@Override
	public void fly() {
		this.duck.performFly();
	}

}

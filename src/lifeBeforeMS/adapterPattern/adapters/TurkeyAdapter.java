package lifeBeforeMS.adapterPattern.adapters;

import lifeBeforeMS.adapterPattern.adaptee.Turkey;
import lifeBeforeMS.strategyPattern.Duck;

/**
 * @author akshay
 *	The adapter implements the target interface and holds an instance of the Adaptee.
 *	Here Turkey is connected to Duck. or Turkey disguised as a duck. 
 */
public class TurkeyAdapter extends Duck {
	private Turkey turkey;
	
	public TurkeyAdapter(Turkey turkey) {
		this.turkey = turkey;
		this.flyBehaviour = ()->{
				for(int i=0;i<2;i++) 
					this.turkey.fly();
			};
		this.quackBehaviour = ()->{this.turkey.gobble();};
	}

	@Override
	public void display() {
		System.out.println("Turkey inside duck");
	}

}

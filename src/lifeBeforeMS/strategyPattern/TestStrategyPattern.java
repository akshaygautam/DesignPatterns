package lifeBeforeMS.strategyPattern;

import lifeBeforeMS.strategyPattern.behaviouralInterfaces.impls.ImMute;
import lifeBeforeMS.strategyPattern.behaviouralInterfaces.impls.NinjaFly;
import lifeBeforeMS.strategyPattern.concreteDucks.DecoyDuck;
import lifeBeforeMS.strategyPattern.concreteDucks.MallardDuck;
import lifeBeforeMS.strategyPattern.concreteDucks.RubberDuck;

public class TestStrategyPattern {
	public static void main(String[] args) {
		Duck decoy = new DecoyDuck();
		Duck rubber = new RubberDuck();
		Duck mallard = new MallardDuck();
		
		decoy.display();
		decoy.performFly();
		decoy.performQuack();
		System.out.println();
		rubber.display();
		rubber.performFly();
		rubber.performQuack();
		System.out.println();
		mallard.display();
		mallard.performFly();
		mallard.performQuack();
		
		// Dynamic behaviour change
		mallard.setFlyBehaviour(new NinjaFly());
		mallard.setQuackBehaviour(new ImMute());
		mallard.performFly();
		System.out.println("With ninja speed mallard can't quack!!\n");
		mallard.performQuack();
		
	}
}

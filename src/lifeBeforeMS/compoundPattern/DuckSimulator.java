package lifeBeforeMS.compoundPattern;

import lifeBeforeMS.compoundPattern.multiplePatterns.Quackable;
import lifeBeforeMS.compoundPattern.multiplePatterns.ducks.Flock;
import lifeBeforeMS.compoundPattern.multiplePatterns.ducks.QuackCounter;
import lifeBeforeMS.compoundPattern.multiplePatterns.factory.AbstractDuckFactory;
import lifeBeforeMS.compoundPattern.multiplePatterns.factory.DuckFactory;
import lifeBeforeMS.compoundPattern.multiplePatterns.geese.Goose;
import lifeBeforeMS.compoundPattern.multiplePatterns.geese.GooseAdapter;
import lifeBeforeMS.compoundPattern.multiplePatterns.observer.Quackologist;

public class DuckSimulator {

	public static void main(String[] args) {
		DuckSimulator simulator = new DuckSimulator();
//		simulator.simulate(new CountingDuckFactory());
		simulator.simulate(new DuckFactory());
	}

	private void simulate(AbstractDuckFactory duckFactory) {
		System.out.println("DUCK SIMULATOR\n");
		
		Quackable mallardDuck = duckFactory.createMallardDuck();
		Quackable readheadDuck = duckFactory.createRedHeadDuck();
		Quackable duckCall = duckFactory.createDuckCall();
		Quackable rubberDuck = duckFactory.createRubberDuck();
		Quackable gooseDuck = new GooseAdapter(new Goose());
		
		Flock flockOfDucks = new Flock();
		flockOfDucks.add(mallardDuck);
		flockOfDucks.add(gooseDuck);
		flockOfDucks.add(rubberDuck);
		flockOfDucks.add(readheadDuck);
		
		Flock flockOfMallardDucks = new Flock();
		flockOfMallardDucks.add(duckFactory.createMallardDuck());
		flockOfMallardDucks.add(duckFactory.createMallardDuck());
		flockOfMallardDucks.add(duckFactory.createMallardDuck());
		flockOfMallardDucks.add(duckFactory.createMallardDuck());
		
		flockOfDucks.add(flockOfMallardDucks);
		
//		simulate(mallardDuck);
//		simulate(readheadDuck);
//		simulate(duckCall);
//		simulate(rubberDuck);
//		simulate(gooseDuck);
		Quackologist quackologist = new Quackologist();
		flockOfDucks.registerObserver(quackologist);
		
		System.out.println("Simulate whole flock");
		simulate(flockOfDucks);
		
		System.out.println("\nSimulate mallard flock");
		simulate(flockOfMallardDucks);
		
		System.out.println("Quack counts: "+ QuackCounter.getQuacks());
	}

	private void simulate(Quackable duck) {
		duck.quack();
	}

}

package compoundPattern.multiplePatterns;

import compoundPattern.multiplePatterns.ducks.DuckCall;
import compoundPattern.multiplePatterns.ducks.Flock;
import compoundPattern.multiplePatterns.ducks.MallardDuck;
import compoundPattern.multiplePatterns.ducks.QuackCounter;
import compoundPattern.multiplePatterns.ducks.RedHeadDuck;
import compoundPattern.multiplePatterns.ducks.RubberDuck;
import compoundPattern.multiplePatterns.factory.AbstractDuckFactory;
import compoundPattern.multiplePatterns.factory.CountingDuckFactory;
import compoundPattern.multiplePatterns.factory.DuckFactory;
import compoundPattern.multiplePatterns.geese.Goose;
import compoundPattern.multiplePatterns.geese.GooseAdapter;
import compoundPattern.multiplePatterns.observer.Quackologist;

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

package compoundPattern.multiplePatterns.factory;

import compoundPattern.multiplePatterns.Quackable;
import compoundPattern.multiplePatterns.ducks.DuckCall;
import compoundPattern.multiplePatterns.ducks.MallardDuck;
import compoundPattern.multiplePatterns.ducks.QuackCounter;
import compoundPattern.multiplePatterns.ducks.RedHeadDuck;
import compoundPattern.multiplePatterns.ducks.RubberDuck;

public class CountingDuckFactory extends AbstractDuckFactory {

	@Override
	public Quackable createMallardDuck() {
		return new QuackCounter(new MallardDuck());
	}

	@Override
	public Quackable createRedHeadDuck() {
		return new QuackCounter(new RedHeadDuck());
	}

	@Override
	public Quackable createDuckCall() {
		return new QuackCounter(new DuckCall());
	}

	@Override
	public Quackable createRubberDuck() {
		return new QuackCounter(new RubberDuck());
	}

}

package compoundPattern.multiplePatterns.factory;

import compoundPattern.multiplePatterns.Quackable;
import compoundPattern.multiplePatterns.ducks.DuckCall;
import compoundPattern.multiplePatterns.ducks.MallardDuck;
import compoundPattern.multiplePatterns.ducks.RedHeadDuck;
import compoundPattern.multiplePatterns.ducks.RubberDuck;

public class DuckFactory extends AbstractDuckFactory {

	@Override
	public Quackable createMallardDuck() {
		return new MallardDuck();
	}

	@Override
	public Quackable createRedHeadDuck() {
		return new RedHeadDuck();
	}

	@Override
	public Quackable createDuckCall() {
		return new DuckCall();
	}

	@Override
	public Quackable createRubberDuck() {
		return new RubberDuck();
	}

}

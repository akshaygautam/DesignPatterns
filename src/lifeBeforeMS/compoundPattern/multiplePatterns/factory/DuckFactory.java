package lifeBeforeMS.compoundPattern.multiplePatterns.factory;

import lifeBeforeMS.compoundPattern.multiplePatterns.Quackable;
import lifeBeforeMS.compoundPattern.multiplePatterns.ducks.DuckCall;
import lifeBeforeMS.compoundPattern.multiplePatterns.ducks.MallardDuck;
import lifeBeforeMS.compoundPattern.multiplePatterns.ducks.RedHeadDuck;
import lifeBeforeMS.compoundPattern.multiplePatterns.ducks.RubberDuck;

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

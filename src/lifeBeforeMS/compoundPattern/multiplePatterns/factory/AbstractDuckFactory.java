package lifeBeforeMS.compoundPattern.multiplePatterns.factory;

import lifeBeforeMS.compoundPattern.multiplePatterns.Quackable;

public abstract class AbstractDuckFactory {
	public abstract Quackable createMallardDuck();
	public abstract Quackable createRedHeadDuck();
	public abstract Quackable createDuckCall();
	public abstract Quackable createRubberDuck();
}

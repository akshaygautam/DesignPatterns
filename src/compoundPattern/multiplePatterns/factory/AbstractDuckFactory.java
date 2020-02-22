package compoundPattern.multiplePatterns.factory;

import compoundPattern.multiplePatterns.Quackable;

public abstract class AbstractDuckFactory {
	public abstract Quackable createMallardDuck();
	public abstract Quackable createRedHeadDuck();
	public abstract Quackable createDuckCall();
	public abstract Quackable createRubberDuck();
}

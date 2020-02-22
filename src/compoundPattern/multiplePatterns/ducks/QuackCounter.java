package compoundPattern.multiplePatterns.ducks;


import compoundPattern.multiplePatterns.Quackable;
import compoundPattern.multiplePatterns.observer.Observable;
import compoundPattern.multiplePatterns.observer.Observer;

public class QuackCounter implements Quackable {
	private Quackable duck;
	static int numberOfQuacks;
	private Observable observable;
	
	public QuackCounter(Quackable duck) {
		this.duck = duck;
		observable = new Observable(this);
	}
	
	@Override
	public void quack() {
		this.duck.quack();
		numberOfQuacks++;
		notifyObeservers();
	}
	
	public static int getQuacks() {
		return numberOfQuacks;
	}

	@Override
	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
	}

	@Override
	public void notifyObeservers() {
		observable.notifyObeservers();
	}

}

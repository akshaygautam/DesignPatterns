package lifeBeforeMS.compoundPattern.multiplePatterns.ducks;


import lifeBeforeMS.compoundPattern.multiplePatterns.Quackable;
import lifeBeforeMS.compoundPattern.multiplePatterns.observer.Observable;
import lifeBeforeMS.compoundPattern.multiplePatterns.observer.Observer;

public class RubberDuck implements Quackable {

	private Observable observable;
	
	public RubberDuck() {
		observable = new Observable(this);
	}
	
	@Override
	public void quack() {
		System.out.println("Squeak");
		notifyObeservers();
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

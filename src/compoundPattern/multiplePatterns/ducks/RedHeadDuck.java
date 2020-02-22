package compoundPattern.multiplePatterns.ducks;


import compoundPattern.multiplePatterns.Quackable;
import compoundPattern.multiplePatterns.observer.Observable;
import compoundPattern.multiplePatterns.observer.Observer;

public class RedHeadDuck implements Quackable {

	private Observable observable;
	
	public RedHeadDuck() {
		observable = new Observable(this);
	}
	
	@Override
	public void quack() {
		System.out.println("Quack");
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

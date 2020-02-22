package compoundPattern.multiplePatterns.ducks;


import compoundPattern.multiplePatterns.Quackable;
import compoundPattern.multiplePatterns.observer.Observable;
import compoundPattern.multiplePatterns.observer.Observer;

public class MallardDuck implements Quackable{
	
	private Observable observable;
	
	public MallardDuck() {
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

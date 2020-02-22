package compoundPattern.multiplePatterns.geese;


import compoundPattern.multiplePatterns.Quackable;
import compoundPattern.multiplePatterns.observer.Observable;
import compoundPattern.multiplePatterns.observer.Observer;

public class GooseAdapter implements Quackable{
	private Observable observable;
	
	private Goose goose;
	
	public GooseAdapter(Goose goose) {
		this.goose = goose;
		observable = new Observable(this);
	}
	@Override
	public void quack() {
		this.goose.honk();
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

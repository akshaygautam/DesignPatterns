package lifeBeforeMS.compoundPattern.multiplePatterns.geese;


import lifeBeforeMS.compoundPattern.multiplePatterns.Quackable;
import lifeBeforeMS.compoundPattern.multiplePatterns.observer.Observable;
import lifeBeforeMS.compoundPattern.multiplePatterns.observer.Observer;

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

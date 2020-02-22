package compoundPattern.multiplePatterns.observer;

import java.util.ArrayList;
import java.util.Iterator;

public class Observable implements QuackObservable {

	private ArrayList<Observer> observers = new ArrayList<Observer>();
	private QuackObservable duck;
	
	public Observable(QuackObservable duck) {
		this.duck = duck;
	}
	
	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void notifyObeservers() {
		Iterator<Observer> iterator = observers.iterator();
		while(iterator.hasNext()) {
			Observer observer = iterator.next();
			observer.update(duck);
		}
	}

}

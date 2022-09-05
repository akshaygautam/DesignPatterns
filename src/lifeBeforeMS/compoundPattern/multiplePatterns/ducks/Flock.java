package lifeBeforeMS.compoundPattern.multiplePatterns.ducks;

import java.util.ArrayList;
import java.util.Iterator;

import lifeBeforeMS.compoundPattern.multiplePatterns.Quackable;
import lifeBeforeMS.compoundPattern.multiplePatterns.observer.Observable;
import lifeBeforeMS.compoundPattern.multiplePatterns.observer.Observer;

public class Flock implements Quackable {
	private ArrayList<Quackable> quackers = new ArrayList<Quackable>();
	private Observable observable;
	
	public Flock() {
		observable = new Observable(this);
	}
	
	public void add(Quackable quacker) {
		this.quackers.add(quacker);
	}
	
	@Override
	public void quack() {
		Iterator<Quackable> iterator = quackers.iterator();
		while(iterator.hasNext()) {
			Quackable quacker = iterator.next();
			quacker.quack();
			notifyObeservers();
		}
	}
	
	@Override
	public void registerObserver(Observer observer) {
		Iterator<Quackable> iterator = quackers.iterator();
		while(iterator.hasNext()) {
			Quackable quacker = iterator.next();
			quacker.registerObserver(observer);
		}
	}

	@Override
	public void notifyObeservers() {
		observable.notifyObeservers();
	}

}

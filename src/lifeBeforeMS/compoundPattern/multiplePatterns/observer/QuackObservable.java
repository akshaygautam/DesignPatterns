package lifeBeforeMS.compoundPattern.multiplePatterns.observer;


public interface QuackObservable {
	public void registerObserver(Observer observer);
	public void notifyObeservers();
}

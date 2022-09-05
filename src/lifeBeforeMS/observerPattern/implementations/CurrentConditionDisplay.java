package lifeBeforeMS.observerPattern.implementations;


import lifeBeforeMS.observerPattern.interfaces.DisplayElement;
import lifeBeforeMS.observerPattern.interfaces.Observer;
import lifeBeforeMS.observerPattern.interfaces.Subject;

public class CurrentConditionDisplay implements Observer, DisplayElement {
	
	private float temperature;
	private float humidity;
	private Subject weatherData;
	
	public CurrentConditionDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void display() {
		String display =  "CurrentConditionDisplay [temperature=" + temperature + ", humidity=" + humidity + "]";
		System.out.println(display);
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.humidity = humidity;
		this.temperature = temp;
		display();
	}

}

package lifeBeforeMS.observerPattern.implementations;


import lifeBeforeMS.observerPattern.interfaces.DisplayElement;
import lifeBeforeMS.observerPattern.interfaces.Observer;
import lifeBeforeMS.observerPattern.interfaces.Subject;

public class StatisticsDisplay implements Observer, DisplayElement {
	
	private float temperature;
	private float pressure;
	private Subject weatherData;
	
	public StatisticsDisplay (Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void display() {
		String display =  "StatisticsDisplay [temperature=" + temperature + ", pressure=" + pressure + "]";
		System.out.println(display);
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.pressure = pressure;
		this.temperature = temp;
		display();
	}

}

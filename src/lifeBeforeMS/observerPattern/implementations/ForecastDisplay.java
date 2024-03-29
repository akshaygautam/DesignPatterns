package lifeBeforeMS.observerPattern.implementations;


import lifeBeforeMS.observerPattern.interfaces.DisplayElement;
import lifeBeforeMS.observerPattern.interfaces.Observer;
import lifeBeforeMS.observerPattern.interfaces.Subject;

public class ForecastDisplay implements Observer, DisplayElement {
	
	private float temperature;
	private float pressure;
	private float humidity;
	private Subject weatherData;
	
	public ForecastDisplay (Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void display() {
		String display =  "ForecastDisplay [temperature=" + temperature + ", pressure=" + pressure + ", humidity=" + humidity +"]";
		System.out.println(display);
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.pressure = pressure;
		this.temperature = temp;
		this.humidity = humidity;
		display();
	}

}

package observerPattern.implementations;

import java.util.Iterator;
import java.util.LinkedList;

import observerPattern.interfaces.Observer;
import observerPattern.interfaces.Subject;

public class WeatherData implements Subject {
	private LinkedList<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
		observers = new LinkedList();
	}
	
	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		observers.remove(o);
	}

	@Override
	public void notifyObservers() {
		Iterator<Observer> i =  observers.iterator();
		while(i.hasNext()) {
			Observer o = i.next();
			o.update(temperature, humidity, pressure);
		}
	}
	
	public void measurementsChanged() {
		notifyObservers();
	}
	
	public LinkedList<Observer> getObservers() {
		return observers;
	}

	public void setObservers(LinkedList<Observer> observers) {
		this.observers = observers;
	}

	public float getTemperature() {
		return temperature;
	}

	public void setTemperature(float temperature) {
		this.temperature = temperature;
		measurementsChanged();
	}

	public float getHumidity() {
		return humidity;
	}

	public void setHumidity(float humidity) {
		this.humidity = humidity;
		measurementsChanged();
	}

	public float getPressure() {
		return pressure;
	}

	public void setPressure(float pressure) {
		this.pressure = pressure;
		measurementsChanged();
	}

	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.pressure = pressure;
		this.temperature = temperature;
		this.humidity = humidity;
		measurementsChanged();
	}

	@Override
	public String toString() {
		return "WeatherData [observers=" + observers + ", temperature=" + temperature + ", humidity=" + humidity
				+ ", pressure=" + pressure + "]";
	}

}

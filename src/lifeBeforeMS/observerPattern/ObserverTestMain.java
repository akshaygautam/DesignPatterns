package lifeBeforeMS.observerPattern;

import lifeBeforeMS.observerPattern.implementations.CurrentConditionDisplay;
import lifeBeforeMS.observerPattern.implementations.ForecastDisplay;
import lifeBeforeMS.observerPattern.implementations.StatisticsDisplay;
import lifeBeforeMS.observerPattern.implementations.WeatherData;

public class ObserverTestMain {
	public static void main(String[] args) {
		// Subject
		WeatherData weatherData = new WeatherData();
		
		//Observers registered to Subject
		CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		
		//Data change in subject will automatically invoke observers
		weatherData.setMeasurements(80, 65, 64.5f);
		System.out.println("-------------------------\n");
		weatherData.setMeasurements(82, 60, 60.5f);
		System.out.println("-------------------------\n");
		weatherData.setHumidity(70.5f);
		
		
	}
	
}

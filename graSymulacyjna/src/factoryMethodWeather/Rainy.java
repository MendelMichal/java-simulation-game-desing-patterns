package factoryMethodWeather;

import java.util.List;

import templateWeather.templateRainy;

public class Rainy implements WeatherInterface {
	
	public List<String> create() {
		templateRainy template = new templateRainy();
		template.build();
		return template.getSpecyfikacja();
	}
	
}

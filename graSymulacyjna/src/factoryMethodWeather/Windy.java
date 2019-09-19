package factoryMethodWeather;

import java.util.List;

import templateWeather.templateWindy;

public class Windy implements WeatherInterface {
	
	public List<String> create() {
		templateWindy template = new templateWindy();
		template.build();
		return template.getSpecyfikacja();
	}
	
}

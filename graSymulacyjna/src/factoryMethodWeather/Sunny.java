package factoryMethodWeather;

import java.util.List;

import templateWeather.templateSunny;

public class Sunny implements WeatherInterface {
	
	public List<String> create() {
		templateSunny template = new templateSunny();
		template.build();
		return template.getSpecyfikacja();
	}
	
}

package factoryMethodWeather;

import java.util.List;

import templateWeather.templateCloudily;

public class Cloudily implements WeatherInterface {
	
	public List<String> create() {
		templateCloudily template = new templateCloudily();
		template.build();
		return template.getSpecyfikacja();
	}
	
}

package factoryMethodWeather;

public class WeatherFactory {
	public WeatherInterface getWeather(String type){
		if(type == null) {
			return null;
		}
		if(type.equalsIgnoreCase("slonecznie")) {
			return new Sunny();
		}
		if(type.equalsIgnoreCase("wietrznie")) {
			return new Windy();
		}
		if(type.equalsIgnoreCase("pochmurnie")) {
			return new Cloudily();
		}
		if(type.equalsIgnoreCase("deszczowo")) {
			return new Rainy();
		}
		
		return null;
	}
}

package factoryMethodDriver;

public class DriverFactory {
	public DriverInterface getDriver(String type){
		if(type == null) {
			return null;
		}
		if(type.equalsIgnoreCase("kobieta")) {
			return new Woman();
		}
		if(type.equalsIgnoreCase("mezczyzna")) {
			return new Men();
		}
		
		return null;
	}
}

package factoryMethodDriver;

import java.util.List;

import templateDriver.templateWoman;

public class Woman implements DriverInterface {
	
	public List<String> create() {
		templateWoman template = new templateWoman();
		template.build();
		return template.getSpecyfikacja();
	}
	
}

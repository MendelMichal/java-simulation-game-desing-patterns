package factoryMethodDriver;

import java.util.List;

import templateDriver.templateMen;

public class Men implements DriverInterface {
	
	public List<String> create() {
		templateMen template = new templateMen();
		template.build();
		return template.getSpecyfikacja();
	}
	
}

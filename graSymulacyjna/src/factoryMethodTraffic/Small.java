package factoryMethodTraffic;

import java.util.List;

import templateTraffic.templateSmall;

public class Small implements TrafficInterface {
	
	public List<String> create() {
		templateSmall template = new templateSmall();
		template.build();
		return template.getSpecyfikacja();
	}
	
}

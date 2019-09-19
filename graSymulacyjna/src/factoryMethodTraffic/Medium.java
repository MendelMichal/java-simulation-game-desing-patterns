package factoryMethodTraffic;

import java.util.List;

import templateTraffic.templateMedium;

public class Medium implements TrafficInterface {
	
	public List<String> create() {
		templateMedium template = new templateMedium();
		template.build();
		return template.getSpecyfikacja();
	}
	
}

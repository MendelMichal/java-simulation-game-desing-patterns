package factoryMethodTraffic;

import java.util.List;

import templateTraffic.templateBig;

public class Big implements TrafficInterface {
	
	public List<String> create() {
		templateBig template = new templateBig();
		template.build();
		return template.getSpecyfikacja();
	}
	
}

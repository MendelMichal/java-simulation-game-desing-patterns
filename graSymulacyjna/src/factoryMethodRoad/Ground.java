package factoryMethodRoad;

import java.util.List;

import templateRoad.templateGround;

public class Ground implements RoadInterface {
	
	public List<String> create() {
		templateGround template = new templateGround();
		template.build();
		return template.getSpecyfikacja();
	}
	
}

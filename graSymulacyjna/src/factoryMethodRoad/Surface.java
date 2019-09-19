package factoryMethodRoad;

import java.util.List;

import templateRoad.templateSurface;

public class Surface implements RoadInterface {
	
	public List<String> create() {
		templateSurface template = new templateSurface();
		template.build();
		return template.getSpecyfikacja();
	}
	
}

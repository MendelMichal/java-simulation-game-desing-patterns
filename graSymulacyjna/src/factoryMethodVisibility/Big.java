package factoryMethodVisibility;

import java.util.List;

import templateVisiblity.templateBig;

public class Big implements VisibilityInterface {
	
	public List<String> create() {
		templateBig template = new templateBig();
		template.build();
		return template.getSpecyfikacja();
	}
	
}

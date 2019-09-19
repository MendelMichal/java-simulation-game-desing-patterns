package factoryMethodVisibility;

import java.util.List;

import templateVisiblity.templateSmall;

public class Small implements VisibilityInterface {
	
	public List<String> create() {
		templateSmall template = new templateSmall();
		template.build();
		return template.getSpecyfikacja();
	}
	
}

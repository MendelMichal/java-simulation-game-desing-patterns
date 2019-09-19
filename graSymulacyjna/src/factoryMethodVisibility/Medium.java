package factoryMethodVisibility;

import java.util.List;

import templateVisiblity.templateMedium;

public class Medium implements VisibilityInterface {
	
	public List<String> create() {
		templateMedium template = new templateMedium();
		template.build();
		return template.getSpecyfikacja();
	}
	
}

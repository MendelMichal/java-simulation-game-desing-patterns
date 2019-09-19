package factoryMethodVisibility;

public class VisibilityFactory {
	public VisibilityInterface getVisibility(String type){
		if(type == null) {
			return null;
		}
		if(type.equalsIgnoreCase("mala")) {
			return new Small();
		}
		if(type.equalsIgnoreCase("srednia")) {
			return new Medium();
		}
		if(type.equalsIgnoreCase("duza")) {
			return new Big();
		}
		
		return null;
	}
}

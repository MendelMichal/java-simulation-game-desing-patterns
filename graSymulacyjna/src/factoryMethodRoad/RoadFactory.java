package factoryMethodRoad;

public class RoadFactory {
	public RoadInterface getRoad(String type){
		if(type == null) {
			return null;
		}
		if(type.equalsIgnoreCase("gruntowa")) {
			return new Ground();
		}
		if(type.equalsIgnoreCase("twarda")) {
			return new Surface();
		}
		
		return null;
	}
}

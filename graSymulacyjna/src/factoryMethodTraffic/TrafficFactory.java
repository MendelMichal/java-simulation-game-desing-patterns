package factoryMethodTraffic;

public class TrafficFactory {
	public TrafficInterface getTraffic(String type){
		if(type == null) {
			return null;
		}
		if(type.equalsIgnoreCase("male")) {
			return new Small();
		}
		if(type.equalsIgnoreCase("srednie")) {
			return new Medium();
		}
		if(type.equalsIgnoreCase("duze")) {
			return new Big();
		}
		
		return null;
	}
}

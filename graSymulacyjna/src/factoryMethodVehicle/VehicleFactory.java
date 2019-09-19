package factoryMethodVehicle;

public class VehicleFactory {
	public VehicleInterface getVehicle(String vehicleType){
		if(vehicleType == null) {
			return null;
		}
		if(vehicleType.equalsIgnoreCase("samochod")) {
			return new Car();
		}
		if(vehicleType.equalsIgnoreCase("motocykl")) {
			return new Motocycle();
		}
		
		return null;
	}
}

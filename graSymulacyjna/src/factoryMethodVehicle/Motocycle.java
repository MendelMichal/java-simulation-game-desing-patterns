package factoryMethodVehicle;

import java.util.List;

import templateVehicle.templateMotocykl;

public class Motocycle implements VehicleInterface {
	public List<String> create() {
		templateMotocykl template = new templateMotocykl();
		template.build();
		return template.getSpecyfikacja();
	}
	
}

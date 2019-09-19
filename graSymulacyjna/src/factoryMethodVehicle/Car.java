package factoryMethodVehicle;

import java.util.List;

import templateVehicle.templateSamochod;

public class Car implements VehicleInterface {
	
	public List<String> create() {
		templateSamochod template = new templateSamochod();
		template.build();
		return template.getSpecyfikacja();
	}
}

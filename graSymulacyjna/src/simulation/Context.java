package simulation;

import java.util.ArrayList;
import java.util.List;

public class Context {
	   private simulation simulation;

	   public Context(simulation simulation){
	      this.simulation = simulation;
	   }
	   
	   private static List<String> symulacjaWynik = new ArrayList<String>();

	   public List<String> executeSimulation(List<String> vehicle, List<String> road, List<String> weather,
			   List<String> traffic, List<String> visibility, List<String> driver){
		   
		  String travelTime = simulation.avarageTravelTime(Float.parseFloat(road.get(1)), Float.parseFloat(vehicle.get(2)), traffic.get(0));
	     
		  String travelTimeLawBreaking = simulation.avarageTravelTime(Float.parseFloat(road.get(1)), Float.parseFloat(vehicle.get(2)), traffic.get(0));
		  
		  float accidentChance = simulation.accidentChance(Float.parseFloat(road.get(1)), Float.parseFloat(vehicle.get(2)), traffic.get(0), weather.get(0), visibility.get(0), driver.get(0), Integer.parseInt(driver.get(2)), Integer.parseInt(driver.get(1)));
		  
		  String deathChance = simulation.deathChance(accidentChance, road.get(0), Float.parseFloat(vehicle.get(3)));
		  
		  String fuelComsumption = simulation.fuelLost(Float.parseFloat(road.get(1)), Float.parseFloat(vehicle.get(2)), traffic.get(0), Float.parseFloat(vehicle.get(1)));
		  
		  symulacjaWynik.add(travelTime);
		  symulacjaWynik.add(travelTimeLawBreaking);
		  symulacjaWynik.add("Szansa na zasymulowany wypadek wynosi " + accidentChance + "%");
		  symulacjaWynik.add(deathChance);
		  symulacjaWynik.add(fuelComsumption);
		  
		  return symulacjaWynik;
	   }
	   
}

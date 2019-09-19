package graSymulacyjna;

import java.util.*;

import factoryMethodRoad.RoadFactory;
import factoryMethodRoad.RoadInterface;
import factoryMethodVehicle.VehicleFactory;
import factoryMethodVehicle.VehicleInterface;
import factoryMethodWeather.WeatherFactory;
import factoryMethodWeather.WeatherInterface;
import factoryMethodTraffic.TrafficFactory;
import factoryMethodTraffic.TrafficInterface;
import factoryMethodVisibility.VisibilityFactory;
import factoryMethodVisibility.VisibilityInterface;
import factoryMethodDriver.DriverFactory;
import factoryMethodDriver.DriverInterface;

import simulation.Context;
import simulation.simulationMotocycle;
import simulation.simulationCar;

import templateVehicle.templateSamochod;
import templateVehicle.templateMotocykl;

public class MainClass {
	static List<String> finalPojazd = new ArrayList<String>();
	static List<String> finalDroga = new ArrayList<String>();
	static List<String> finalPogoda = new ArrayList<String>();
	static List<String> finalRuch = new ArrayList<String>();
	static List<String> finalWidocznosc = new ArrayList<String>();
	static List<String> finalKierowca = new ArrayList<String>();
	
	public static void main(String[] args) {
		
		// Wybieranie rodzaju pojazdu przez u¿ytkownika i jego konfiguracja
		Vehicle();
//		templateSamochod object = new templateSamochod();
//		System.out.println(object.getSpecyfikacja());
		
		// Wybieranie rodzaju nawierzchni drogi i jej konfiguracja
		Road();
		
		// Wybieranie rodzaju pogody i jej konfiguracja
		Weather();
		
		// Wybieranie rodzaju nate¿enia ruchu i jej konfiguracja
		Traffic();
		
		// Wybieranie rodzaju widocznosci na drodze i jej konfiguracja
		Visibility();
		
		// Wybieranie plec kierowcy i jego konfiguracja
		Driver();
		
		//Rozpoczecie symulacji
		StartSimulation();
		
	}
	
	private static void StartSimulation() {
		Context context;
		if(finalPojazd.get(0) == "Motocykl") {
			context = new Context(new simulationMotocycle());
		} else {
			context = new Context(new simulationCar());
		}
		
		context.executeSimulation(finalPojazd, finalDroga, finalPogoda, 
				finalRuch, finalWidocznosc, finalKierowca).forEach(
						step->System.out.println(step));
	}
	
	private static void Driver() {
		int check = 0;
		Scanner plecKierowcy = new Scanner(System.in);
		System.out.println("Wprowadz plec kierowcy (kobieta/mezczyzna)");
		while(check == 0) {
			String SplecKierowcy = plecKierowcy.nextLine();
			
			DriverFactory driverFactory = new DriverFactory();
			DriverInterface driver = driverFactory.getDriver(SplecKierowcy);
			
			if(driver == null) {
				System.out.println("B³¹d - podano z³¹ p³eæ kierowcy. Wprowadz ponownie (kobieta/mezczyzna)");
			} else {
				finalKierowca = driver.create();
				check = 1;
			}
		}
	}
	
	private static void Visibility() {
		int check = 0;
		Scanner rodzajWidocznosci = new Scanner(System.in);
		System.out.println("Wprowadz panujaca widocznosc na drodze (duza/srednia/mala)");
		while(check == 0) {
			String SrodzajWidocznosci = rodzajWidocznosci.nextLine();
			
			VisibilityFactory visibilityFactory = new VisibilityFactory();
			VisibilityInterface visibility = visibilityFactory.getVisibility(SrodzajWidocznosci);
			
			if(visibility == null) {
				System.out.println("B³¹d - podano z³y rodzaj widocznosci. Wprowadz ponownie (duza/srednia/mala)");
			} else {
				finalWidocznosc = visibility.create();
				check = 1;
			}
		}
	}
	
	private static void Traffic() {
		int check = 0;
		Scanner rodzajRuchu = new Scanner(System.in);
		System.out.println("Wprowadz nate¿enie ruchu (male/srednie/duze)");
		while(check == 0) {
			String SrodzajRuchu = rodzajRuchu.nextLine();
			
			TrafficFactory trafficFactory = new TrafficFactory();
			TrafficInterface traffic = trafficFactory.getTraffic(SrodzajRuchu);
			
			if(traffic == null) {
				System.out.println("B³¹d - podano z³y rodzaj natezenia ruchu. Wprowadz ponownie (male/srednie/duze)");
			} else {
				finalRuch = traffic.create();
				check = 1;
			}
		}
	}
	
	private static void Weather() {
		int check = 0;
		Scanner rodzajPogody = new Scanner(System.in);
		System.out.println("Wprowadz rodzaj pogody (slonecznie/wietrznie/pochmurnie/deszczowo)");
		while(check == 0) {
			String SrodzajPogody = rodzajPogody.nextLine();
			
			WeatherFactory weatherFactory = new WeatherFactory();
			WeatherInterface weather = weatherFactory.getWeather(SrodzajPogody);
			
			if(weather == null) {
				System.out.println("B³¹d - podano z³y rodzaj pogody. Wprowadz ponownie (slonecznie/wietrznie/pochmurnie/deszczowo)");
			} else {
				finalPogoda = weather.create();
				check = 1;
			}
		}
	}
	
	private static void Road() {
		int check = 0;
		Scanner rodzajDrogi = new Scanner(System.in);
		System.out.println("Wprowadz rodzaj drogi (gruntowa/twarda)");
		while(check == 0) {
			String SrodzajDrogi = rodzajDrogi.nextLine();
			
			RoadFactory roadFactory = new RoadFactory();
			RoadInterface road = roadFactory.getRoad(SrodzajDrogi);
			
			if(road == null) {
				System.out.println("B³¹d - podano z³y rodzaj drogi. Wprowadz ponownie (gruntowa/twarda)");
			} else {
				finalDroga = road.create();
				check = 1;
			}
		}
	}
	
	private static void Vehicle() {
		int check = 0;
		Scanner rodzajPojazdu = new Scanner(System.in);
		System.out.println("Wprowadz rodzaj pojazdu (samochod/motocyckl)");
		while(check == 0) {
			String SrodzajPojazdu = rodzajPojazdu.nextLine();
			
			VehicleFactory vehicleFactory = new VehicleFactory();
			VehicleInterface vehicle = vehicleFactory.getVehicle(SrodzajPojazdu);
			
			if(vehicle == null) {
				System.out.println("B³¹d - podano z³y rodzaj pojazdu. Wprowadz ponownie (samochod/motocyckl)");
			} else {
				finalPojazd = vehicle.create();
				check = 1;
			}
		}
	}
}

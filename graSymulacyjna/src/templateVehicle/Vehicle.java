package templateVehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Vehicle {
	protected static List<String> specyfikacja = new ArrayList<String>();
	
	public final void build() {
		wybranyTypPojazdu();
		wprowadzSpalanie();
		wprowadzPredkosc();
		wprowadzWage();
	}
	
	protected void wybranyTypPojazdu() {
		
	}
	
	private void wprowadzSpalanie() {
		int check = 0;
		Scanner spalanie = new Scanner(System.in);
		System.out.println("Wprowadz �rednie spalanie pojazdu (ilosc litrow/100km)");
		while(check == 0) {
			String wpisaneSpalanie = spalanie.nextLine();
			
			if(tryParseFloat(wpisaneSpalanie)) {
				if(Float.parseFloat(wpisaneSpalanie) > 0) {
				this.specyfikacja.add(wpisaneSpalanie);
				check = 1;
				} else {
					System.out.println("Podano niew�a�ciw� warto�� �redniego spalania. Wprowad� ponownie");
				}
			} else {
				System.out.println("Podano niew�a�ciw� warto�� �redniego spalania. Wprowad� ponownie");
			}
		}
	}
	
	private void wprowadzPredkosc() {
		int check = 0;
		Scanner predkosc = new Scanner(System.in);
		System.out.println("Wprowadz �redni� pr�dko�� pojazdu (km/h)");
		while(check == 0) {
			String wpisanaPredkosc = predkosc.nextLine();
			
			if(tryParseFloat(wpisanaPredkosc)) {
				if(Float.parseFloat(wpisanaPredkosc) > 0) {
				this.specyfikacja.add(wpisanaPredkosc);
				check = 1;
				} else {
					System.out.println("Podano niew�a�ciw� warto�� �redniej pr�dko�ci. Wprowad� ponownie");
				}
			} else {
				System.out.println("Podano niew�a�ciw� warto�� �redniej pr�dko�ci. Wprowad� ponownie");
			}
		}
	}
	
	private void wprowadzWage() {
		int check = 0;
		Scanner waga = new Scanner(System.in);
		System.out.println("Wprowadz wag� pojazdu (kg)");
		while(check == 0) {
			String wpisanaWaga = waga.nextLine();
			
			if(tryParseFloat(wpisanaWaga)) {
				if(Float.parseFloat(wpisanaWaga) > 0) {
				this.specyfikacja.add(wpisanaWaga);
				check = 1;
				} else {
					System.out.println("Podano niew�a�ciw� warto�� wagi pojazdu. Wprowad� ponownie");
				}
			} else {
				System.out.println("Podano niew�a�ciw� warto�� wagi pojazdu. Wprowad� ponownie");
			}
		}
	}
	
	public List<String> getSpecyfikacja() {
		return this.specyfikacja;
	}
	
	private boolean tryParseFloat(String value) {  
	     try {  
	         Float.parseFloat(value);  
	         return true;  
	      } catch (NumberFormatException e) {  
	         return false;  
	      }  
	}
}

package templateDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Driver {
	protected static List<String> specyfikacja = new ArrayList<String>();
	
	public final void build() {
		wybranaPlec();
		wprowadzWiek();
		wprowadzDoswiadczenie();
	}
	
	protected void wybranaPlec() {
		
	}
	
	private void wprowadzWiek() {
		int check = 0;
		Scanner wiek = new Scanner(System.in);
		System.out.println("Wprowadz wiek kierowcy (w latach - liczba calkowita)");
		while(check == 0) {
			String wpisaneWiek = wiek.nextLine();
			
			if(tryParseInt(wpisaneWiek)) {
				if(Integer.parseInt(wpisaneWiek) > 0) {
				this.specyfikacja.add(wpisaneWiek);
				check = 1;
				} else {
					System.out.println("Podano niew≥aúciwy wiek kierowcy. Wprowadü ponownie");
				}
			} else {
				System.out.println("Podano niew≥aúciwy wiek kierowcy. Wprowadü ponownie");
			}
		}
	}
	
	private void wprowadzDoswiadczenie() {
		int check = 0;
		Scanner doswiadczenie = new Scanner(System.in);
		System.out.println("Wprowadz doswiadczenie kierowcy (w latach - liczba calkowita)");
		while(check == 0) {
			String wpisaneDoswiadczenie = doswiadczenie.nextLine();
			
			if(tryParseInt(wpisaneDoswiadczenie)) {
				if(Integer.parseInt(wpisaneDoswiadczenie) > 0) {
				this.specyfikacja.add(wpisaneDoswiadczenie);
				check = 1;
				} else {
					System.out.println("Podano niew≥aúciwe doswiadczenie kierowcy. Wprowadü ponownie");
				}
			} else {
				System.out.println("Podano niew≥aúciwe doswiadczenie kierowcy. Wprowadü ponownie");
			}
		}
	}
	
	
	public List<String> getSpecyfikacja() {
		return this.specyfikacja;
	}
	
	private boolean tryParseInt(String value) {  
	     try {  
	         Integer.parseInt(value);  
	         return true;  
	      } catch (NumberFormatException e) {  
	         return false;  
	      }  
	}
}

package templateRoad;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Road {
	protected static List<String> specyfikacja = new ArrayList<String>();
	
	public final void build() {
		wybranyRodzajDrogi();
		wprowadzDlugosc();
	}
	
	protected void wybranyRodzajDrogi() {
		
	}
	
	private void wprowadzDlugosc() {
		int check = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Wprowadz d³ugoœæ drogi (w km)");
		while(check == 0) {
			String wpisanaDlugosc = scanner.nextLine();
			
			if(tryParseFloat(wpisanaDlugosc)) {
				if(Float.parseFloat(wpisanaDlugosc) > 0) {
				this.specyfikacja.add(wpisanaDlugosc);
				check = 1;
				} else {
					System.out.println("Podano niew³aœciw¹ wartoœæ d³ugoœci drogi. WprowadŸ ponownie");
				}
			} else {
				System.out.println("Podano niew³aœciw¹ wartoœæ d³ugoœci drogi. WprowadŸ ponownie");
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

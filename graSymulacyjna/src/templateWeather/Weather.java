package templateWeather;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Weather {
	protected static List<String> specyfikacja = new ArrayList<String>();
	
	public final void build() {
		wybranyRodzajPogody();
	}
	
	protected void wybranyRodzajPogody() {
		
	}
	
	public List<String> getSpecyfikacja() {
		return this.specyfikacja;
	}
}

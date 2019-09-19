package templateTraffic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Traffic {
	protected static List<String> specyfikacja = new ArrayList<String>();
	
	public final void build() {
		wybranyRodzajRuchu();
	}
	
	protected void wybranyRodzajRuchu() {
		
	}
	
	public List<String> getSpecyfikacja() {
		return this.specyfikacja;
	}
}

package templateVisiblity;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Visibility {
	protected static List<String> specyfikacja = new ArrayList<String>();
	
	public final void build() {
		wybranyRodzajWidocznosci();
	}
	
	protected void wybranyRodzajWidocznosci() {
		
	}
	
	public List<String> getSpecyfikacja() {
		return this.specyfikacja;
	}
}

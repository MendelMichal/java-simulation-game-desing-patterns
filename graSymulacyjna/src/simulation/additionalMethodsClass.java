package simulation;

import java.util.Random;

public class additionalMethodsClass {
	protected float randomNumber(float min, float max) {
		Random generator = new Random();
		float randomNumber = min + generator.nextFloat() * (max - min);
		
		return randomNumber;
	}
	
	protected String toHHMMSS(int seconds) {
        int p1 = seconds % 60;
        int p2 = seconds / 60;
        int p3 = p2 % 60;
        p2 = p2 / 60;
        return(p2 + " godzin " + p3 + " minut " + p1 + "sekund");
	}
}

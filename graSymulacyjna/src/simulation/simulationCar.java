package simulation;

import java.util.Random;

public class simulationCar extends additionalMethodsClass implements simulation {

	@Override
	public String avarageTravelTime(float roadLength, float avarageSpeed, String traffic) {
		float randomTrafficValue = 0;
		int result;
		float randomNumber;
	       
		result = (int) Math.round(((roadLength/avarageSpeed)*60)*60);
		
		switch (traffic) {
		  case "Duze":
			  randomTrafficValue = this.randomNumber(0.2f, 0.4f);
		    break;
		  case "Srednie":
			  randomTrafficValue = this.randomNumber(0f, 0.2f);
		    break;
		  case "Male":
			  randomTrafficValue = 0;
			break;
		}
		
		result = result + (int) Math.round(result * randomTrafficValue);
		
		randomNumber = this.randomNumber(0f, 0.4f);
		
		result = result - (int) Math.round(result * randomNumber);

		return "�redni zasymulowany czas z jakim samoch�d pokona tras� wynosi " + this.toHHMMSS(result);
	}

	@Override
	public String avarageTravelTimeLawBreaking(float roadLength, float avarageSpeed, String traffic) {
		float randomTrafficValue = 0;
		int result;
		float randomNumber;
		
		Random generator = new Random();
		randomNumber = generator.nextInt(50);
	       
		result = (int) Math.round(((roadLength/(avarageSpeed + randomNumber))*60)*60);
		
		switch (traffic) {
		  case "Duze":
			  randomTrafficValue = this.randomNumber(0.2f, 0.4f);
		    break;
		  case "Srednie":
			  randomTrafficValue = this.randomNumber(0f, 0.2f);
		    break;
		  case "Male":
			  randomTrafficValue = 0;
			break;
		}
		
		result = result + (int) Math.round(result * randomTrafficValue);
		
		randomNumber = this.randomNumber(0f, 0.4f);
		
		result = result - (int) Math.round(result * randomNumber);

		return "�redni zasymulowany czas z jakim samoch�d pokona tras� �ami�c przepisy drogowe wynosi " + this.toHHMMSS(result);
	}

	@Override
	public float accidentChance(float roadLength, float avarageSpeed, String traffic, String weather,
			String visibility, String driverGender, int driverExperience, int driverAge) {
		
		float roadRatio = roadLength/800f;
		float speedRatio = (float) Math.pow((avarageSpeed/100f),1.2f);
		
		float trafficRatio = 0f;
		switch (traffic) {
		  case "Duze":
			  trafficRatio = this.randomNumber(0.2f, 0.3f);
		    break;
		  case "Srednie":
			  trafficRatio = this.randomNumber(0.1f, 0.2f);
		    break;
		  case "Male":
			  trafficRatio = this.randomNumber(0f, 0.1f);
			break;
		}
		
		float weatherRatio = 0f;
		switch (weather) {
		  case "Pochmurnie":
			  weatherRatio = this.randomNumber(0f, 0.1f);
		    break;
		  case "Deszczowo":
			  weatherRatio = this.randomNumber(0.2f, 0.3f);
		    break;
		  case "Slonecznie":
			  weatherRatio = this.randomNumber(0f, 0.05f);
			break;
		  case "Wietrznie":
			  weatherRatio = this.randomNumber(0f, 0.1f);
			break;
		}
		
		float visibilityRatio = 0f;
		switch (visibility) {
		  case "Duza":
			  visibilityRatio = (float) 0.0;
		    break;
		  case "Srednia":
			  visibilityRatio = this.randomNumber(0f, 0.2f);
		    break;
		  case "Mala":
			  visibilityRatio = this.randomNumber(0.2f, 0.4f);
			break;
		}
		
		float genderRatio = 0f;
		switch (driverGender) {
		  case "Mezczyzna":
			  genderRatio = this.randomNumber(0f, 0.1f);
		    break;
		  case "Kobieta":
			  genderRatio = this.randomNumber(0.1f, 0.2f);
		    break;
		}
		
		float experienceRatio = (float) Math.pow((1f/(float)driverExperience),0.7f);
		
		float ageRatio = 0;
		if(driverAge <= 25) {
			ageRatio = this.randomNumber(0.1f, 0.22f);
		}
		else if(driverAge > 25 && driverAge <= 60) {
			ageRatio = this.randomNumber(0f, 0.1f);
		}
		else if(driverAge > 60) {
			ageRatio = this.randomNumber(0.1f, 0.22f);
		}
		
		float result = roadRatio + speedRatio + trafficRatio + weatherRatio + visibilityRatio + genderRatio + ageRatio;
		
		return result;
	}

	@Override
	public String deathChance(float accidentChance, String road, float vehicleWeight) {
		float result;
		
		float weightRatio = (float) Math.pow((400f/180f),0.2f);
		
		float roadRatio = 0f;
		switch (road) {
		  case "Gruntowa":
			  roadRatio = this.randomNumber(0.1f, 0.2f);
		    break;
		  case "Twarda":
			  roadRatio = this.randomNumber(0.2f, 0.4f);
		    break;
		}
		
		result = accidentChance - weightRatio + roadRatio;
		
		return "Szansa na �mier� na drodze wynosi " + result;
	}

	@Override
	public String fuelLost(float roadLength, float avarageSpeed, String traffic, float FuelComsuption) {
		float Mathresult = (roadLength * FuelComsuption)/100f;
		float speedRatio = FuelComsuption/avarageSpeed * 10;

		float trafficRatio = 0f;
		switch (traffic) {
		  case "Duze":
			  trafficRatio = this.randomNumber(0.3f, 0.5f);
		    break;
		  case "Srednie":
			  trafficRatio = this.randomNumber(0.1f, 0.2f);
		    break;
		  case "Male":
			  trafficRatio = this.randomNumber(0f, 0.1f);
			break;
		}
		
		float result = Mathresult + speedRatio + trafficRatio;
		
		return "�rednia ilo�� paliwa, jak� samoch�d spali na drodze o d�ugo�ci " + roadLength + "km wynosi " + result + "l";
	}

}

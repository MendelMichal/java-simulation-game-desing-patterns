package simulation;

import java.util.Random;

public class simulationMotocycle extends additionalMethodsClass implements simulation {

	@Override
	public String avarageTravelTime(float roadLength, float avarageSpeed, String traffic) {
		float randomTrafficValue = 0;
		int result;
		float randomNumber;
	       
		result = (int) Math.round(((roadLength/avarageSpeed)*60)*60);
		
		switch (traffic) {
		  case "Duze":
			  randomTrafficValue = this.randomNumber(0.1f, 0.2f);
		    break;
		  case "Srednie":
			  randomTrafficValue = this.randomNumber(0f, 0.1f);
		    break;
		  case "Male":
			  randomTrafficValue = 0;
			break;
		}
		
		result = result + (int) Math.round(result * randomTrafficValue);
		
		randomNumber = this.randomNumber(0f, 0.4f);
		
		result = result - (int) Math.round(result * randomNumber);

		return "Œredni zasymulowany czas z jakim motocykl pokona trasê wynosi " + this.toHHMMSS(result);
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
			  randomTrafficValue = this.randomNumber(0.1f, 0.2f);
		    break;
		  case "Srednie":
			  randomTrafficValue = this.randomNumber(0f, 0.1f);
		    break;
		  case "Male":
			  randomTrafficValue = 0;
			break;
		}
		
		result = result + (int) Math.round(result * randomTrafficValue);
		
		randomNumber = this.randomNumber(0f, 0.4f);
		
		result = result - (int) Math.round(result * randomNumber);

		return "Œredni zasymulowany czas z jak¹ motocykl pokona trasê ³ami¹c przepisy drogowe wynosi " + this.toHHMMSS(result);
	}
	
	@Override
	public float accidentChance(float roadLength, float avarageSpeed, String traffic, String weather,
			String visibility, String driverGender, int driverExperience, int driverAge) {
		
		float roadRatio = roadLength/600f;
		float speedRatio = (float) Math.pow((avarageSpeed/70f),1.4f);
		
		float trafficRatio = 0f;
		switch (traffic) {
		  case "Duze":
			  trafficRatio = this.randomNumber(0.3f, 0.4f);
		    break;
		  case "Srednie":
			  trafficRatio = this.randomNumber(0.1f, 0.3f);
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
			  weatherRatio = this.randomNumber(0.3f, 0.5f);
		    break;
		  case "Slonecznie":
			  weatherRatio = this.randomNumber(0f, 0.05f);
			break;
		  case "Wietrznie":
			  weatherRatio = this.randomNumber(0.1f, 0.2f);
			break;
		}
		
		float visibilityRatio = 0f;
		switch (visibility) {
		  case "Duza":
			  visibilityRatio = (float) 0.0;
		    break;
		  case "Srednia":
			  visibilityRatio = this.randomNumber(0f, 0.3f);
		    break;
		  case "Mala":
			  visibilityRatio = this.randomNumber(0.3f, 0.6f);
			break;
		}
		
		float genderRatio = 0f;
		switch (driverGender) {
		  case "Mezczyzna":
			  genderRatio = this.randomNumber(0f, 0.2f);
		    break;
		  case "Kobieta":
			  genderRatio = this.randomNumber(0f, 0.1f);
		    break;
		}
		
		float experienceRatio = (float) Math.pow((1f/(float)driverExperience),0.7f);
		
		float ageRatio = 0;
		if(driverAge <= 25) {
			ageRatio = this.randomNumber(0.2f, 0.32f);
		}
		else if(driverAge > 25 && driverAge <= 60) {
			ageRatio = this.randomNumber(0.1f, 0.2f);
		}
		else if(driverAge > 60) {
			ageRatio = this.randomNumber(0f, 0.1f);
		}
		
		float result = roadRatio + speedRatio + trafficRatio + weatherRatio + visibilityRatio + genderRatio + ageRatio;
		
		return result;
	}

	@Override
	public String deathChance(float accidentChance, String road, float vehicleWeight) {
		float result, result2;
		
		float weightRatio = (float) Math.pow((70f/180f),0.2f);
		
		float roadRatio = 0f;
		switch (road) {
		  case "Gruntowa":
			  roadRatio = this.randomNumber(0.2f, 0.4f);
		    break;
		  case "Twarda":
			  roadRatio = this.randomNumber(0.3f, 0.7f);
		    break;
		}
		
		result = accidentChance - weightRatio + roadRatio;
		result2 = accidentChance - weightRatio + roadRatio + this.randomNumber(0.5f, 0.8f);
		
		return "Szansa na œmieræ na drodze w kasku wynosi " + result + "%, a bez kasku wynosi " + result2 + "%";
	}

	@Override
	public String fuelLost(float roadLength, float avarageSpeed, String traffic, float FuelComsuption) {
		float Mathresult = (roadLength * FuelComsuption)/100f;
		float speedRatio = FuelComsuption/avarageSpeed * 10;

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
		
		float result = Mathresult + speedRatio + trafficRatio;
		
		return "Œrednia iloœæ paliwa, jak¹ motocykl spali na drodze o d³ugoœci " + roadLength + "km wynosi " + result + "l";
	}
}

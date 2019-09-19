package simulation;

public interface simulation {
	public String avarageTravelTime(float roadLength, float avarageSpeed, String traffic);
	public String avarageTravelTimeLawBreaking(float roadLength, float avarageSpeed, String traffic);
	public float accidentChance(float roadLength, float avarageSpeed, String traffic, String weather,
			String visibility, String driverGender, int driverExperience, int driverAge);
	public String deathChance(float accidentChance, String road, float vehicleWeight);
	public String fuelLost(float roadLength, float avarageSpeed, String traffic, float FuelComsuption);
}

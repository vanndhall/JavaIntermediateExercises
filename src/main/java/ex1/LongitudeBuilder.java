package ex1;

public class LongitudeBuilder {

	private Longitude  longitude;

	public LongitudeBuilder() {
		longitude = new Longitude();
	}

	public LongitudeBuilder withDegrees(Integer degrees){
		longitude.setDegree(degrees);
		return this;
	}

	public LongitudeBuilder withMinutes(Integer minutes){
		longitude.setMinutes(minutes);
		return this;
	}

	public LongitudeBuilder withSeconds(Integer seconds){
		longitude.setSeconds(seconds);
		return this;
	}
	public Longitude build(){
		return longitude;
	}
}

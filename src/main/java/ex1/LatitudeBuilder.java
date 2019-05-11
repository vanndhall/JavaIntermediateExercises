package ex1;

public class LatitudeBuilder {
	private Latitude latitude;

	public LatitudeBuilder(){
		latitude = new Latitude();
	}

	public LatitudeBuilder withDegrees(Integer degrees){
		latitude.setDegree(degrees);
		return this;
	}

	public LatitudeBuilder withMinutes(Integer minutes){
		latitude.setMinutes(minutes);
		return this;
	}

	public LatitudeBuilder withSeconds(Integer seconds){
		latitude.setSeconds(seconds);
		return this;
	}
	public Latitude build(){
		return latitude;
	}
}

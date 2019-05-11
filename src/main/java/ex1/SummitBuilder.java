package ex1;

import java.time.LocalDate;

// Second Step - crate builder -
public class SummitBuilder {
	private Summit summit; // create instance of class that builder will be using

	public SummitBuilder() { // create constructor  and initial instance
		summit = new Summit();
	}

	public SummitBuilder withName (String name){
		summit.setName(name);
		return this;
	 }
	 public SummitBuilder withHeight (Integer height){
		 summit.setHeight(height);
		 return this;
	 }
	public SummitBuilder withLongitude (Longitude longitude){
		summit.setLongitude(longitude);
		return this;
	}
	public SummitBuilder withLatitude (Latitude latitude){
		summit.setLatitude(latitude);
		return this;
	}
	 public SummitBuilder withFirstSummerAscent (LocalDate firstSummerAscent){
		 summit.setFirstSummerAscent(firstSummerAscent);
		 return this;
	 }

	public SummitBuilder withFirstWinterAscent (LocalDate firstWinterAscent){
		summit.setFirstWinterAscent(firstWinterAscent);
		return this;
	}

	public Summit build(){
		return summit;
	}



}

package ex1;


import java.time.LocalDate;

//1 step - create veribes
public class Summit {
	private String name;
	private Integer height;
	private Longitude longitude;
	private Latitude latitude;
	private LocalDate firstSummerAscent;
	private LocalDate firstWinterAscent;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public Longitude getLongitude() {
		return longitude;
	}

	public void setLongitude(Longitude longitude) {
		this.longitude = longitude;
	}

	public Latitude getLatitude() {
		return latitude;
	}

	public void setLatitude(Latitude latitude) {
		this.latitude = latitude;
	}

	public LocalDate getFirstSummerAscent() {
		return firstSummerAscent;
	}

	public void setFirstSummerAscent(LocalDate firstSummerAscent) {
		this.firstSummerAscent = firstSummerAscent;
	}

	public LocalDate getFirstWinterAscent() {
		return firstWinterAscent;
	}

	public void setFirstWinterAscent(LocalDate firstWinterAscent) {
		this.firstWinterAscent = firstWinterAscent;
	}


}

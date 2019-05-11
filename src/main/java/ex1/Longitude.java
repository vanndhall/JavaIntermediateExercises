package ex1;

import java.util.Objects;

public class Longitude {
	private Integer degree;
	private Integer minutes;
	private Integer seconds;

	public Integer getDegree() {
		return degree;
	}

	public void setDegree(Integer degree) {
		this.degree = degree;
	}

	public Integer getMinutes() {
		return minutes;
	}

	public void setMinutes(Integer minutes) {
		this.minutes = minutes;
	}

	public Integer getSeconds() {
		return seconds;
	}

	public void setSeconds(Integer seconds) {
		this.seconds = seconds;
	}
//ctrl+inser - equlas +hascode = defaults options (click everytime enter)
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Longitude longitude = (Longitude) o;
		return Objects.equals(degree, longitude.degree) &&
				Objects.equals(minutes, longitude.minutes) &&
				Objects.equals(seconds, longitude.seconds);
	}

	@Override
	public int hashCode() {
		return Objects.hash(degree, minutes, seconds);
	}
}

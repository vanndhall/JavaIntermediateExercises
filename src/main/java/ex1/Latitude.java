package ex1;

import java.util.Objects;

public class Latitude {
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

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Latitude latitude = (Latitude) o;
		return Objects.equals(degree, latitude.degree) &&
				Objects.equals(minutes, latitude.minutes) &&
				Objects.equals(seconds, latitude.seconds);
	}

	@Override
	public int hashCode() {
		return Objects.hash(degree, minutes, seconds);
	}
}

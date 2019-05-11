package ex1;

import ex1.Latitude;
import ex1.LatitudeBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

public class LatitudeBuilderTest {

	@Test
	public void shouldCreateCorrectLatitudeObject(){
		//given
		final Integer expectedDegress = 0;
		final Integer expectedMinutes = 0;
		final Integer expectedSeconds = 0;
		LatitudeBuilder builder = new LatitudeBuilder();

		//when
		Latitude result = builder.withDegrees(0).withMinutes(0).withSeconds(0).build();

		//then
		assertEquals(expectedDegress, result.getDegree());
		assertEquals(expectedMinutes, result.getMinutes());
		assertEquals(expectedSeconds, result.getSeconds());
	}

}
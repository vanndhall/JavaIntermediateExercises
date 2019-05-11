package ex1;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongitudeBuilderTest {
	@Test
	public void shouldCreateCorrectLongitudeObject(){
		//given
		final Integer expectedDegress = 0;
		final Integer expectedMinutes = 0;
		final Integer expectedSeconds = 0;
		LongitudeBuilder builder = new LongitudeBuilder();

		//when
		Longitude result = builder.withDegrees(0).withMinutes(0).withSeconds(0).build();

		//then
		assertEquals(expectedDegress, result.getDegree());
		assertEquals(expectedMinutes, result.getMinutes());
		assertEquals(expectedSeconds, result.getSeconds());
	}
}
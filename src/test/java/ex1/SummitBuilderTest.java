package ex1;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class SummitBuilderTest {

	@Test
	public void shouldCreateCorrectSummitObject(){
		//given
		final String expectedName="Mt.Everest";
		final Integer expectedHeight = 8848;
		final LocalDate expectedFirstSummerAscent = LocalDate.of(1953,5,29);
		final LocalDate expectedFirstWinterAscent = LocalDate.of(1980,2,17);
		final Longitude expectedLongitude = new LongitudeBuilder()
				.withDegrees(86).withMinutes(55).withSeconds(31).build();
		final Latitude expectedLatitude = new LatitudeBuilder()
				.withDegrees(29).withMinutes(59).withSeconds(17).build();
		SummitBuilder builder = new SummitBuilder();

		//when
		Summit result = builder.withName("Mt.Everest").withHeight(8848)
				.withFirstSummerAscent(LocalDate.of(1953,5,29))
				.withFirstWinterAscent(LocalDate.of(1980,2,17))
				.withLatitude(new LatitudeBuilder().withDegrees(29).withMinutes(59).withSeconds(17).build())
				.withLongitude(new LongitudeBuilder().withDegrees(86).withMinutes(55).withSeconds(31).build())
				.build();

		//then
		assertEquals(expectedName, result.getName());
		assertEquals(expectedHeight, result.getHeight());
		assertEquals(expectedFirstSummerAscent, result.getFirstSummerAscent());
		assertEquals(expectedFirstWinterAscent, result.getFirstWinterAscent());
		assertEquals(expectedLatitude, result.getLatitude());
		assertEquals(expectedLongitude, result.getLongitude());

	}
}
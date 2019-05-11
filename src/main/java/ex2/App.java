package ex2;

import java.util.Arrays;
import java.util.List;

public class App {
	public static void main(String[] args) {
		ValueSeekerFactory factory = new ValueSeekerFactory();
		ValueSeeker seeker = factory.produce(ValueType.MIN);

		List<Integer> elements=
				Arrays.asList(43,6546,24235,7957,88843 );
		System.out.println(seeker.find((elements)));

	}
}

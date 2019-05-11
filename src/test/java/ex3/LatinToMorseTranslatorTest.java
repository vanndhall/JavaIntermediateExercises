package ex3;

import org.junit.Test;

import static org.junit.Assert.*;

public class LatinToMorseTranslatorTest {

	@Test
	public void shouldTranslateText(){
		//get
		final String textToTranslate = "Litwo ojczyzno ty moja";
		final String expectedResult = ".-.. .. - .-- --- / --- .--- -.-. --.. -.-- --.. -. --- / - -.-- / -- --- .--- .-";

		final InMemoryLatinMorseDictionary dictionary =
				new InMemoryLatinMorseDictionary();

		final Translator translator =
				new LatinToMorseTranslator(dictionary.getDictionary());

		//when
		String result = translator.translate(textToTranslate);


		//then
		assertEquals(expectedResult,result);
	}

}
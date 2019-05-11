package ex3;

import java.util.HashMap;
import java.util.Map;

public class LatinToMorseTranslator implements Translator {

	private static final String CHARACTER_SPACE = " ";
	private static final String CHARACTER_SLASH = "/";

	private Map<String,String> dictionary;
	LatinToMorseTranslator(Map<String, String> dictionary){
		this.dictionary = dictionary;

	}

	@Override
	public String translate(String text) {
		String[] words = text.split(CHARACTER_SPACE);

		StringBuffer stringBuffer = new StringBuffer();
		int counterOfProcessedWords = 1;
		for(String word: words){

			//String translateWord = translateWord(word);
			//StrinBuffer.append(translateWord) - alternative
			stringBuffer.append(translateWord(word));

			if(counterOfProcessedWords < words.length){
				stringBuffer.append(CHARACTER_SLASH);
				stringBuffer.append(CHARACTER_SPACE);
			}
			counterOfProcessedWords++;

		}
		return stringBuffer.toString().trim();
	}

	private String translateWord(String word) {
		StringBuffer stringBuffer = new StringBuffer();

		for(Character character : word.toCharArray()){
			String translatedCharacter = dictionary.get(character.toString().toUpperCase());
			stringBuffer.append(translatedCharacter);
			stringBuffer.append(CHARACTER_SLASH);
			stringBuffer.append(CHARACTER_SPACE);
		}

		return stringBuffer.toString();
	}

	//StringBuffer.append - dokleja kolejne slowo
}

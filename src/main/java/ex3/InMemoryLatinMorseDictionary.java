package ex3;

import java.util.HashMap;
import java.util.Map;

class InMemoryLatinMorseDictionary {
	Map<String, String> getDictionary(){

		Map<String, String> dictionary = new HashMap<>();
		dictionary.put("A", ".-");
		dictionary.put("B", "-...");
		dictionary.put("C", "-.-.");
		dictionary.put("D", "-..");
		dictionary.put("E", ".");
		dictionary.put("F", "..-.");
		dictionary.put("G", "--.");
		dictionary.put("H", "....");
		dictionary.put("I", "..");
		dictionary.put("J", ".---");
		dictionary.put("K", "-.-");
		dictionary.put("L", ".-..");
		dictionary.put("M", "--");
		dictionary.put("N", "-.");
		dictionary.put("O", "---");
		dictionary.put("P", ".--.");
		dictionary.put("Q", "--.-");
		dictionary.put("R", ".-.");
		dictionary.put("S", "...");
		dictionary.put("T", "-");
		dictionary.put("U", "..-");
		dictionary.put("V", "...-");
		dictionary.put("W", ".--");
		dictionary.put("X", "-..-");
		dictionary.put("Y", "-.--");
		dictionary.put("Z", "--..");

		return dictionary;
	}
}

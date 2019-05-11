package ex2;

import java.util.List;

public class InputValidator {
	public void validate(List<Integer> input){
		if (input == null || input.isEmpty()){
			throw new EmptyListException("Lista nie może być pusta!");
		}
	}
}

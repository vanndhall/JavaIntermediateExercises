package ex2;

import java.util.List;

class MinValueSeeker implements ValueSeeker {

	@Override
	public Integer find(List<Integer> values) {
		InputValidator validator = new InputValidator();
		validator.validate(values);
		//validate(values);

		Integer min = Integer.MAX_VALUE; //warunek początkowy

		for(Integer value : values){
			if(min > value){
				min =value;
			}
		}
		return min;
	}

	// Aby nieprzepisywać kodu wilokrotnie, utworzyłem osobną klase InputVALIDATOR, którą zainicjuje a pózniej wykorzystam
//	private void validate(List<Integer> values) {
//		if(values == null || values.isEmpty()){
//			throw new EmptyListException("Lista nie może być pusta!");
//		}
//	}
}

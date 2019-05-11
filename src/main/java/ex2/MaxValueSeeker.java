package ex2;

import java.util.List;

class MaxValueSeeker implements ValueSeeker {
	@Override
	public Integer find(List<Integer> values) {

		InputValidator validator = new InputValidator();
		validator.validate(values);
		//validate(values);

		Integer max = Integer.MIN_VALUE; //warunek początkowy

		for(Integer value : values){
			if(max < value){
				max =value;
			}
		}
		return max;
	}

//	private void validate(List<Integer> values) {
//		if(values == null || values.isEmpty()){
//			throw new EmptyListException("Lista nie może być pusta!");
//		}
//	}
}

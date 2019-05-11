package ex2;

public class ValueSeekerFactory {
	ValueSeeker produce(ValueType valueType){
		ValueSeeker product = null;

		if(ValueType.MAX.equals(valueType)){
			product = new MaxValueSeeker();
		}

		if(ValueType.MIN.equals(valueType)){
			product = new MinValueSeeker();
		}
		return product;
	}
}

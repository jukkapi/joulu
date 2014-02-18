package joulu.collections;

import joulu.equivalence.Equivalence;

public class NaturalEquivalence<T> implements Equivalence<T> {

	@Override
	public boolean areEquivalent(T value1, T value2) {
		return value1.equals(value2);
	}

}

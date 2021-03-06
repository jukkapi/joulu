package joulu.collections;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import joulu.equivalence.Equivalence;

import org.junit.Test;

public class NaturalEquivalenceTest {
	@Test
	public void createAndTest() {
		Equivalence<String> e = new NaturalEquivalence<String>();
		assertTrue(e.areEquivalent("foo", "foo"));
		assertFalse(e.areEquivalent("foo", "bar"));
	}
}

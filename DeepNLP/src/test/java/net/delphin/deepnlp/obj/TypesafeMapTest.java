package net.delphin.deepnlp.obj;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import net.delphin.deepnlp.annotations.Annotation;
import net.delphin.deepnlp.data.TypesafeMap;

import org.junit.Test;


public abstract class TypesafeMapTest {

	abstract TypesafeMap newInstance();

	/**
	 * TestAnnotation<br>
	 * <br>
	 * Trivial {@link Annotation} for testing
	 *
	 * @author trimblet
	 * @since Feb 13, 2016
	 * @version 0.1
	 */
	private final static class TestAnnotation implements Annotation {}


	@Test
	public void testBasic() {
		TypesafeMap instance = this.newInstance();
		TestAnnotation annotation = new TestAnnotation();

		assertTrue(instance.isEmpty());
		assertEquals(0, instance.size());
		assertFalse(instance.containsKey(TestAnnotation.class));
		assertEquals(Optional.empty(), instance.get(TestAnnotation.class));

		instance.put(TestAnnotation.class, annotation);
		assertTrue(instance.containsKey(TestAnnotation.class));
		assertEquals(Optional.of(annotation), instance.get(TestAnnotation.class));
		assertEquals(1, instance.size());

		instance.remove(TestAnnotation.class);
		assertTrue(instance.isEmpty());
		assertEquals(0, instance.size());
		assertFalse(instance.containsKey(TestAnnotation.class));
		assertEquals(Optional.empty(), instance.get(TestAnnotation.class));
	}


	@Test
	public void testKeySet() {
		Set<Class<? extends TypesafeMap.Key>> keySet = Collections.unmodifiableSet(new HashSet<Class<? extends TypesafeMap.Key>>(Arrays.asList(TestAnnotation.class)));
		TypesafeMap instance = this.newInstance();
		TestAnnotation annotation = new TestAnnotation();

		assertEquals(Collections.emptySet(), instance.keySet());

		instance.put(TestAnnotation.class, annotation);
		assertEquals(keySet, instance.keySet());
	}
}

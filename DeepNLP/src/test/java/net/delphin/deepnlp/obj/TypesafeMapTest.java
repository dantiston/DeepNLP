package net.delphin.deepnlp.obj;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import net.delphin.deepnlp.annotators.Annotator;
import net.delphin.deepnlp.data.Document;

import org.junit.Test;


public abstract class TypesafeMapTest {

	abstract TypesafeMap newInstance();

	private final static class TestAnnotation implements Annotator {

		private static int counter = 0;
		private final int id;


		@Override
		public void annotate(Document document) {}


		TestAnnotation() {
			this.id = counter++;
		}


		@Override
		public boolean equals(Object obj) {
			if (this == obj) {
				return true;
			}
			if (obj == null) {
				return false;
			}
			if (this.getClass() != obj.getClass()) {
				return false;
			}
			TestAnnotation other = (TestAnnotation) obj;
			if (this.id != other.id) {
				return false;
			}
			return true;
		}


		@Override
		public String toString() {
			return String.valueOf(this.id);
		}
	}


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

package net.delphin.deepnlp.data;


import java.util.Map;
import java.util.Optional;
import java.util.Set;


/**
 * TypesafeMap
 *
 * An implementation of Joshua Bloch's TypeSafe hetereogeneous {@link Map}.
 * Store values by their type.
 *
 * @author trimblet
 * @since Feb 13, 2016
 * @version 0.1
 * @see Bloch, Joshua. 2008. "Effective Java", Second Edition. Pearson
 *      Education.
 */
public interface TypesafeMap {

	/**
	 * Marker interface for {@link TypesafeMap} entries
	 */
	public static interface Key {}


	/**
	 * Return an {@link Optional} of the value specified by the given key if
	 * present, else {@link Optional#empty()}
	 *
	 * @param key
	 *            specifying the desired value {@link Class}
	 * @return the object specified by the key
	 */
	public Optional<? extends Key> get(Class<? extends Key> key);


	/**
	 * Store the given value at the given key
	 *
	 * @param key
	 *            the {@link Class} of the specified value
	 * @param value
	 *            the value of specified by the given key
	 */
	public void put(Class<? extends Key> key, Key value);


	/**
	 * Remove the value specified by the given key
	 *
	 * @param key
	 *            specifying the desired value {@link Class} to remove
	 * @return the object specified by the key
	 */
	public Optional<? extends Key> remove(Class<? extends Key> key);


	/**
	 * Returns true if and only if the given key has a value in this object
	 *
	 * @param key
	 *            specifying the desired value {@link Class} to remove
	 * @return the object specified by the key
	 */
	public boolean containsKey(Class<? extends Key> key);


	/**
	 * @return the number of elements stored in this object
	 */
	public int size();


	/**
	 * @return the {@link Class} objects stored in this object
	 */
	public Set<Class<? extends Key>> keySet();


	/**
	 * @return true if and only if size == 0
	 */
	public boolean isEmpty();
}

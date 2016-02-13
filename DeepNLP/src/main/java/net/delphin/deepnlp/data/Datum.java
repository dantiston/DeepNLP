package net.delphin.deepnlp.data;


import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

import net.delphin.deepnlp.obj.TypesafeMap;
import net.delphin.deepnlp.obj.TypesafeMap.Key;


public class Datum implements TypesafeMap {

	private static final Integer INITIAL_CAPACITY = 4;

	private final Map<Class<? extends Key>, Key> data;


	public Datum() {
		this.data = new HashMap<Class<? extends Key>, Key>(INITIAL_CAPACITY);
	}


	@Override
	public Optional<Key> get(Class<? extends Key> key) {
		return Optional.ofNullable(this.data.get(key));
	}


	@Override
	public void put(Class<? extends Key> key, Key value) {
		this.data.put(key, value);
	}


	@Override
	public Optional<Key> remove(Class<? extends Key> key) {
		return Optional.ofNullable(this.data.remove(key));
	}


	@Override
	public boolean containsKey(Class<? extends Key> key) {
		return this.data.containsKey(key);
	}


	@Override
	public int size() {
		return this.data.size();
	}


	@Override
	public Set<Class<? extends Key>> keySet() {
		return this.data.keySet();
	}


	@Override
	public boolean isEmpty() {
		return this.data.isEmpty();
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((this.data == null) ? 0 : this.data.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Datum)) {
			return false;
		}
		Datum other = (Datum) obj;
		if (this.data == null) {
			if (other.data != null) {
				return false;
			}
		} else if (!this.data.equals(other.data)) {
			return false;
		}
		return true;
	}

}

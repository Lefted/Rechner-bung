package de.hska.iwi.ads.solution.hashtable;

import de.hska.iwi.ads.dictionary.AbstractHashMap;

public class Hashtable<K extends Comparable<K>, V> extends AbstractHashMap<K, V> {

	public Hashtable(int capacity) {
		super(capacity);
	}

	@Override
	public V get(Object o) {
		@SuppressWarnings("unchecked")
		K key = (K) o;

		int i = 0;
		do {
			int index = getIndex(key, i);
			if (hashtable[index] != null && hashtable[index].getKey() == key) {
				return hashtable[index].getValue();
			}
		} while (hashtable[i] != null && i < hashtable.length);
		return null;
	}

	@Override
	public V put(K key, V value) {
		int i = 0;
		do {
			int index = getIndex(key, i);
			if (hashtable[index] == null) {
				hashtable[index] = new SimpleEntry<>(key, value);
				size++;
				return null;
			} else if (hashtable[index].getKey() == key) {
				V previousValue = hashtable[index].getValue();
				hashtable[index].setValue(value);
				return previousValue;
			}
		} while (i < hashtable.length);
		throw new DictionaryFullException();
	}

	public int getIndex(K key, int sondierung) {
		return (key.hashCode() + sondierung * sondierung) % hashtable.length;
	}

	public int findBucketIndex(K key) {
		for (int i = 0; (i * i) < hashtable.length; i++) {
			int index = (key.hashCode() + (i * i)) % hashtable.length;
			if (hashtable[index] == null || hashtable[index].getKey() == key)
				return index;
		}
		return -1;
	}

	@Override
	public V remove(Object key) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean remove(Object key, Object value) {
		throw new UnsupportedOperationException();
	}

}

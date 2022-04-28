package de.hska.iwi.ads.solution.list;

import java.util.Objects;

import de.hska.iwi.ads.dictionary.AbstractDoubleLinkedList;

public class DoubleLinkedList<K extends Comparable<K>, V> extends AbstractDoubleLinkedList<K, V> {

	@Override
	public V get(Object o) {
		@SuppressWarnings("unchecked")
		K key = (K) o;
		AbstractDoubleLinkedList<K, V>.ListElement found = searchElement(key);
		return found != null ? found.entry.getValue() : null;
	}

	@Override
	public V put(K key, V value) {
		AbstractDoubleLinkedList<K, V>.ListElement oldElement = searchElement(key);

		if (oldElement != null) { // replace already existing element
			V oldValue = oldElement.entry.getValue();
			oldElement.entry.setValue(value);
			return oldValue;
		} else { // insert new element at head
			ListElement newHead = new ListElement(new SimpleEntry<>(key, value), null, head);

			if (head != null) {
				head.previous = newHead;
			}
			head = newHead;
			size++;
		}
		return null;
	}

	// @VisibleForTesting
	public AbstractDoubleLinkedList<K, V>.ListElement searchElement(K key) {
		// key cannot be null, also this makes two tests green
		Objects.requireNonNull(key);
		
		var current = head;

		while (current != null) {
			if (current.entry.getKey() == key) {
				return current;
			}
			current = current.next;
		}
		return null;
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

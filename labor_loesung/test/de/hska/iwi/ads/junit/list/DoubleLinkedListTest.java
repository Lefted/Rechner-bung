package de.hska.iwi.ads.junit.list;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Map;

import org.junit.jupiter.api.Test;

import de.hska.iwi.ads.dictionary.AbstractDoubleLinkedList;
import de.hska.iwi.ads.dictionary.MapTest;
import de.hska.iwi.ads.solution.list.DoubleLinkedList;

public class DoubleLinkedListTest extends MapTest {

	@Override
	public <K extends Comparable<K>, V> Map<K, V> createMap() {
		return new DoubleLinkedList<>();
	}

	@Test
	void searchingForOne_SHOULD_returnEins() {
		DoubleLinkedList<Integer, Object> map = new DoubleLinkedList<>();
		map.put(1, "Eins");
		AbstractDoubleLinkedList<Integer, Object>.ListElement element = map.searchElement(1);
		assertEquals("Eins", element.entry.getValue());
	}
	
	@Test
	void replacingExistingElement_SHOULD_returnOldValue() {
		DoubleLinkedList<Integer, Object> map = new DoubleLinkedList<>();
		map.put(1, "Eins");
		Object existing = map.put(1, "Zwei");
		assertEquals("Eins", existing);
	}
}

package de.hska.iwi.ads.junit.tree;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Map;

import org.junit.jupiter.api.Test;

import de.hska.iwi.ads.dictionary.MapTest;
import de.hska.iwi.ads.solution.tree.BinarySearchTree;

public class BinarySearchTreeTest extends MapTest {

	@Override
	public <K extends Comparable<K>, V> Map<K, V> createMap() {
		return new BinarySearchTree<>();
	}

	@Test
	void replacingAlreadyExistingValue_SHOULD_returnOldValue() {
		Map<Integer, String> dictionary = createMap();
		dictionary.put(5, "Fünf");
		dictionary.put(5, "Drei");
		assertEquals(1, dictionary.size());
		assertEquals("Drei", dictionary.get(5));
	}

	@Test
	void gettingNonExistingValue_SHOULD_returnNull() {
		Map<Integer, String> dictionary = createMap();
		dictionary.put(5, "Fünf");
		assertEquals(1, dictionary.size());
		assertNull(dictionary.get(2));
	}
}

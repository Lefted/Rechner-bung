package de.hska.iwi.ads.junit.search;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import de.hska.iwi.ads.search.Search;
import de.hska.iwi.ads.search.SearchTest;
import de.hska.iwi.ads.solution.search.BinarySearch;

class BinarySearchTest extends SearchTest {

	@Override
	public <E extends Comparable<E>> Search<E> createSearch() {
		return new BinarySearch<>();
	}

	@Test
	void testSimple() {
		Search<Integer> search = createSearch();
		Integer[] a = { 0, 2, 4, 7, 9, 10, 11 };

		assertEquals(2, search.search(a, 4));
	}

	@Test
	void lowestIndex() {
		Search<Integer> search = createSearch();
		Integer[] a = { 4, 4, 4, 4, 4, 4 };

		assertEquals(0, search.search(a, 4));
	}

	@Test
	void firstCase() {
		Search<Integer> search = createSearch();
		Integer[] a = { 2, 2, 4, 6 };

		assertEquals(-1, search.search(a, 1));
	}

	@Test
	void secondCase() {
		Search<Integer> search = createSearch();
		Integer[] a = { 2, 2, 4, 6 };

		assertEquals(4, search.search(a, 8));
	}
}

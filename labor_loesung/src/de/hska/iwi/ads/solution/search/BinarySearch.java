package de.hska.iwi.ads.solution.search;

import de.hska.iwi.ads.search.Search;

public class BinarySearch<E extends Comparable<E>> implements Search<E> {

	@Override
	public int search(E[] a, E key, int left, int right) {
		if (a[left].compareTo(key) > 0) {
			return left - 1;
		}

		if (a[right].compareTo(key) < 0) {
			return right + 1;
		}

		return simpleSearch(a, key, left, right);
	}

	private int simpleSearch(E[] a, E key, int left, int right) {
		if (right < left) {
			return left;
		}
		int midIndex = (left + right) / 2;
		E midValue = a[midIndex];

		if (midValue.compareTo(key) == 0) {
			if (midIndex - 1 >= 0 && a[midIndex - 1].compareTo(key) == 0) {
				return simpleSearch(a, key, left, midIndex - 1);
			}
			return midIndex;
		} else if (midValue.compareTo(key) < 0) { // midValue is less than key
			return simpleSearch(a, key, midIndex + 1, right);
		} else { // midValue is greater than key
			return simpleSearch(a, key, left, midIndex - 1);
		}
	}
}

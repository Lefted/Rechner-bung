package de.hska.iwi.ads.junit.sorting;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

import de.hska.iwi.ads.solution.sorting.MergeSort;

public class MergeSortTest {

	@Test
	void alreadySortedArray_SHOULD_staySorted() {
		// arrange
		Integer[] a = { 0, 2, 4, 7, 9, 10, 11 };
		MergeSort<Integer> mergeSort = new MergeSort<>();

		// act
		mergeSort.sort(a);

		// assert
		Integer[] expected = { 0, 2, 4, 7, 9, 10, 11 };
		assertArrayEquals(expected, a);
	}

	@Test
	void nonSortedArray_SHOULD_be_Sorted() {
		// arrange
		Integer[] a = { 11, 7, 4, 2, 9, 10, 0 };
		MergeSort<Integer> mergeSort = new MergeSort<>();

		// act
		mergeSort.sort(a);

		// assert
		Integer[] expected = { 0, 2, 4, 7, 9, 10, 11 };
		assertArrayEquals(expected, a);
	}
}

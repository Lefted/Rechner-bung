package de.hska.iwi.ads.junit.sorting;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import de.hska.iwi.ads.solution.sorting.MergeSort;
import de.hska.iwi.ads.solution.sorting.ReverseMergeSort;

public class ReverseMergeSortTest {

	@Test
	void alreadySortedArray_SHOULD_staySorted() {
		// arrange
		Integer[] a = { 0, 2, 4, 7, 9, 10, 11 };
		ReverseMergeSort<Integer> mergeSort = new ReverseMergeSort<>();

		// act
		mergeSort.sort(a);

		// assert
		Integer[] expected = { 0, 2, 4, 7, 9, 10, 11 };
		assertArrayEquals(expected, a);
	}

	@Test
	void descendingSortedArray_SHOULD_beSorted_Ascending() {
		// arrange
		Integer[] a = { 7, 4, 2, 0 };
		ReverseMergeSort<Integer> mergeSort = new ReverseMergeSort<>();

		// act
		mergeSort.sort(a);

		// assert
		Integer[] expected = { 0, 2, 4, 7 };
		assertArrayEquals(expected, a);
	}

	@Test
	void nonSortedArray_SHOULD_be_Sorted() {
		// arrange
		Integer[] a = { 11, 7, 4, 2, 9, 10, 0 };
		ReverseMergeSort<Integer> mergeSort = new ReverseMergeSort<>();

		// act
		mergeSort.sort(a);

		// assert
		Integer[] expected = { 0, 2, 4, 7, 9, 10, 11 };
		assertArrayEquals(expected, a);
	}
}

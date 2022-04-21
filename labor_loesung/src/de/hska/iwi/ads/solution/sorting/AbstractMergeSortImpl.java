package de.hska.iwi.ads.solution.sorting;

import de.hska.iwi.ads.sorting.AbstractMergesort;

public abstract class AbstractMergeSortImpl<E extends Comparable<E>> extends AbstractMergesort<E> {

	@Override
	protected void mergesort(E[] a, int left, int right) {
		if (left < right) {
			int midIndex = (left + right) / 2;
			mergesort(a, left, midIndex);
			mergesort(a, midIndex + 1, right);
			merge(a, left, midIndex, right);
		}
	}

	protected abstract void merge(E[] a, int left, int midIndex, int right);

}

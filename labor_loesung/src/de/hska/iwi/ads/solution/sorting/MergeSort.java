package de.hska.iwi.ads.solution.sorting;

public class MergeSort<E extends Comparable<E>> extends AbstractMergeSortImpl<E> {

	@Override
	protected void merge(E[] a, int left, int midIndex, int right) {
		int l = left;
		int r = midIndex + 1;
		for (int i = left; i <= right; i++) {
			if (r > right || (l <= midIndex && a[l].compareTo(a[r]) <= 0)) {
				b[i] = a[l];
				l++;
			} else {
				b[i] = a[r];
				r++;
			}
		}

		for (int i = left; i <= right; i++) {
			a[i] = b[i];
		}
	}
}

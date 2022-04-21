package de.hska.iwi.ads.solution.sorting;

public class ReverseMergeSort<E extends Comparable<E>> extends AbstractMergeSortImpl<E> {

	@Override
	protected void merge(E[] a, int left, int midIndex, int right) {
		// reverse right part
		ReverseArray<E> reverseArray = new ReverseArray<>();
		reverseArray.reverse(a, midIndex + 1, right);
		
		// merge
		int l = left;
		int r = right;
		for (int i = left; i <= right; i++) {
			if (a[l].compareTo(a[r]) <= 0) {
				b[i] = a[l];
				l++;
			} else {
				b[i] = a[r];
				r--;
			}
		}
		
		for (int i = left; i <= right; i++) {
			a[i] = b[i];
		}
	}
}

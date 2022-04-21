package de.hska.iwi.ads.solution.sorting;

import de.hska.iwi.ads.sorting.Reverse;

public class ReverseArray<E extends Comparable<E>> implements Reverse<E> {

	@Override
	public void reverse(E[] a, int from, int to) {
		for (int i = from; i <= (to+from)/2; i++) {	// reverse values in a between from and to
			E temp = a[i];
			a[i] = a[to - (i - from)];
			a[to - (i - from)] = temp;
		}
	}
}

package de.hska.iwi.ads.solution.generics;

import de.hska.iwi.ads.generics.Box;

public class Cardbox<T> extends Box<T> {

	public Cardbox(int volume, T content) {
		super(volume, content);
	}

	@Override
	public int compareTo(Box<T> o) {
		return volume - o.getVolume();
	}

}

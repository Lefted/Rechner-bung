package de.hska.iwi.ads.junit.generics;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import de.hska.iwi.ads.solution.generics.Cardbox;

class CardboxTest {

	@Test
	void testLarger() {
		Cardbox<Class<Integer>> box1 = new Cardbox<>(2, Integer.class);
		Cardbox<Class<Integer>> box2 = new Cardbox<>(1, Integer.class);
		assertTrue(box1.compareTo(box2) > 0);
	}
	
	@Test
	void testSmaller() {
		Cardbox<Class<Integer>> box1 = new Cardbox<>(2, Integer.class);
		Cardbox<Class<Integer>> box2 = new Cardbox<>(1, Integer.class);
		assertTrue(box2.compareTo(box1) < 0);
	}
	
	@Test
	void testEqual() {
		Cardbox<Class<Integer>> box1 = new Cardbox<>(2, Integer.class);
		Cardbox<Class<Integer>> box2 = new Cardbox<>(2, Integer.class);
		assertEquals(0, box1.compareTo(box2));
		assertEquals(0, box2.compareTo(box1));
	}
}

package de.hska.iwi.ads.junit.interfaces;

import de.hska.iwi.ads.interfaces.Vector;
import de.hska.iwi.ads.interfaces.VectorTest;
import de.hska.iwi.ads.solution.interfaces.CartesianVector;

class CartesianVectorTest extends VectorTest {

	@Override
	public Vector createVector(double x, double y) {
		return new CartesianVector(x, y);
	}

}

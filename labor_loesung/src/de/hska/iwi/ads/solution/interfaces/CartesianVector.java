package de.hska.iwi.ads.solution.interfaces;

import de.hska.iwi.ads.interfaces.Vector;

public class CartesianVector implements Vector {

	private double x;
	private double y;

	public CartesianVector(double x, double y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public void scale(double factor) {
		x *= factor;
		y *= factor;
	}

	@Override
	public double getDimension() {
		return Math.sqrt(x * x + y * y);
	}

	@Override
	public double getX() {
		return x;
	}

	@Override
	public double getY() {
		return y;
	}

	@Override
	public double getDirection() {
		return Math.atan2(y, x);
	}

	@Override
	public Vector add(Vector addend) {
		return new CartesianVector(x + addend.getX(), y + addend.getY());
	}

}

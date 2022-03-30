package de.hska.iwi.ads.solution.interfaces;

import de.hska.iwi.ads.interfaces.AbstractCircle;
import de.hska.iwi.ads.interfaces.Vector;

public class Circle extends AbstractCircle {

	public Circle(Vector middlePoint, double radius) {
		super(middlePoint, radius);
	}

	public Circle(double radius) {
		super(radius);
	}

	@Override
	public void scale(double factor) {
		if (factor > 0.0D) {
			radius *= factor;
		}
	}

	@Override
	public double area() {
		return radius * radius * Math.PI;
	}

	@Override
	public double getDimension() {
		return radius;
	}
}

package model.entities;

import model.enums.Color;

public class Circle extends AbstractShape {

	private double radius;

	public Circle(Color color, double radius) {
		super(color);
		this.radius = radius;
	}

	@Override
	public double area() {
		return Math.PI * Math.pow(this.radius, 2);
	}

}

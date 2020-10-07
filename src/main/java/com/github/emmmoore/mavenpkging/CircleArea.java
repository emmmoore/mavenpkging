package com.github.emmmoore.mavenpkging;

public class CircleArea {
	private double radius;
	public CircleArea() {
		radius = 5.0;
	}
	public CircleArea(double radiusR) {
		this.radius = radiusR;
	}
	public double getRadius() {
		return this.radius;
	}
	public void setRadius(double radiusR) {
		this.radius = radiusR;
	}
	public double getCircleArea() {
		return (Math.PI * radius * radius);
	}
}
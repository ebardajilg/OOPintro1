package org.escoladeltreball.oopintro1;

public class Square {
	
	protected double side;
	
	/**
	 * @param side
	 */
	public Square(double side) {
		this.side = side;
	}

	public double perimeter() {
		return side * 4;
	}
	
	public double area() {
		return side * side;
	}
}

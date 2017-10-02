package org.escoladeltreball.oopintro1;

/**
 * 
 * @author iaw39443990
 *
 */
public abstract class Triangle extends FigureImpl {
	
	protected double base;
	protected double height;
	
	
	/**
	 * @param base
	 * @param height
	 */
	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}

	public double area() {
		return base * height /2;
	}
	
	//Es abstracto porque es diferente en cada tipo de triangulo.
	public abstract double perimeter();
	
}

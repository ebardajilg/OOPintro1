/**
 * 
 */
package org.escoladeltreball.oopintro1;

/**
 * @author iaw39443990
 *
 */
public class Isosceles extends Triangle {

	/**
	 * @param base
	 * @param height
	 */
	public Isosceles(double base, double height) {
		super(base, height);
	}

	@Override
	public double perimeter() {
		return 3 * base;
	}

	
	
}

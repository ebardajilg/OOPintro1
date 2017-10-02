/**
 * 
 */
package org.escoladeltreball.oopintro1;

/**
 * @author iaw39443990
 *
 */
public class Equilatero extends Triangle {

	/**
	 * @param base
	 * @param height
	 */
	public Equilatero(double base, double height) {
		super(base, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double perimeter() {
		return 3 * base;
	}

}

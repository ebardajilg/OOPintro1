/**
 * 
 */
package org.esocladeltreball.oopintro1;

import static org.junit.Assert.*;

import org.escoladeltreball.oopintro1.Equilatero;
import org.escoladeltreball.oopintro1.Triangle;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author iaw39443990
 *
 */
public class IsoscelesTest {
	Triangle triangle;
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		triangle = new Equilatero(3.0, 5.0);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		triangle = null;
	}

	/**
	 * Test method for {@link org.escoladeltreball.oopintro1.Isosceles#perimeter()}.
	 */
	@Test
	public final void testPerimeter() {
		assertEquals(9.0, triangle.perimeter(), 1.0e-4);
	}

}

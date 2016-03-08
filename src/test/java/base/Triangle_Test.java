package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author DSzczechura
 * Triangle_Test covered tests of the getArea() and getPerimeter() methods. Coverage is only 53.7%
 * of entire project because only getArea() and getPerimeter() were to be tested.
 */
public class Triangle_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	double side1 = 2.0;
	double side2 = 3.0;
	double side3 = 2.0;
	
	Triangle test_triangle = new Triangle(side1, side2, side3);
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Tests the getArea() method using assertEquals and an expected 
	 * and actual value within a 0.01 difference.
	 */
	@Test
	public void testgetArea() {
	double expected = 1.98;
	double actual = test_triangle.getArea();
	
	assertEquals(expected, actual, .01);
	
	}

	/**
	 * Tests the getPerimeter() method using assertEquals and an expected 
	 * and actual value within a 0.01 difference.
	 */
	@Test
	public void testgetPerimeter() {
	double expected = 7.0;
	double actual = test_triangle.getPerimeter();
	
	assertEquals(expected, actual, .01);
	}
}

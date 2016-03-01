package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author DSzczechura Total program coverage is only 61.4% because main method
 *         with the user-input wasn't tested, only calculation methods were
 *         tested (which are covered 100%).
 */
public class MyTuition_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	double initial_tuition = 12000;
	double percentage_increase = 0.12;
	double repayment_apr = 0.05;
	int repayment_term = 10;
	double grand_total = MyTuition.TotalTuition(initial_tuition, percentage_increase);

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
	 * Tests the TotalTuition method in the MyTuition class: Coverage = 100%
	 */
	@Test
	public void testTotalTuition() {
		double expected = 100320.00;
		double actual = MyTuition.TotalTuition(initial_tuition, percentage_increase);
		assertEquals(expected, actual, 0.01);
	}

	/**
	 * Tests the TuitionPayment method in the MyTuition class: Coverage = 100%
	 */
	@Test
	public void testTuitionPayment() {
		double expected = 1082.66;
		double actual = MyTuition.TuitionPayment(grand_total, repayment_apr, repayment_term);
		assertEquals(expected, actual, 0.01);
	}
}

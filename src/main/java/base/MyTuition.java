package base;

import java.util.Scanner;
import java.lang.Math;

/**
 * @author DSzczechura
 *
 */
public class MyTuition {
	/**
	 * user-input variables to be used in calculations
	 */
	private static double initial_tuition;
	private static double percentage_increase;
	private static double repayment_apr;
	private static int repayment_term;

	/**
	 * The main method collects the user input using Scanner to be stored in the private
	 * variables of the MyTuition class. The main method is also where output print
	 * commands occur that tell user the calculated total tuition cost and monthly payment of student loans.
	 */
	public static void main(String[] args) {
		Scanner user_input = new Scanner(System.in);

		System.out.println("What is your initial cost of tuition for the semester?");
		initial_tuition = user_input.nextDouble();

		System.out.println("What is the annual percentage (as a decimal) increase of your tuition?");
		percentage_increase = user_input.nextDouble();

		System.out.println("What is the fixed APR (as a decimal) on your student loan?");
		repayment_apr = user_input.nextDouble();

		System.out.println("What is the repayment term (in years) on your student loan?");
		repayment_term = user_input.nextInt();

		user_input.close();

		System.out.printf("Total cost of tuition is: $%,.2f" + "\n",
				TotalTuition(initial_tuition, percentage_increase));
		System.out.printf("Monthly payment for student loan is: $%,.2f",
				TuitionPayment(TotalTuition(initial_tuition, percentage_increase), repayment_apr, repayment_term));
	}

	/**
	 * The TotalTuition method uses a for loop to calculate the total cost of tuition over 4 years.
	 * @param initial_tuition - represents the first year tuition of a university (per semester), so calculation multiplies this
	 * by 2 to account for an entire year.
	 * @param percentage_increase - represents the percentage increase in a university's tuition every year (in decimal form).
	 * @return - a double called grand_total, which represents the total tuition cost over 4 years taking into account
	 * tuition percentage increases every year.
	 */
	public static double TotalTuition(double initial_tuition, double percentage_increase) {
		double grand_total = 0;

		for (int i = 0; i < 4; i++) {
			if (i == 0) {
				grand_total += (2 * initial_tuition);
			} else {
				grand_total += ((2 * initial_tuition) + (initial_tuition * percentage_increase));
			}
		}
		return grand_total;
	}

	/**
	 * @param grand_total - represents the total tuition cost over 4 years as found in the TotalTuition method.
	 * @param repayment_apr - represents the interest rate of the loan.
	 * @param repayment_term - represents the number of years payments will be spread out to pay off loan.
	 * @return - a double called monthly_payment, which represents how much must be paid every month in order to pay off student
	 * loans (dependent on repayment_apr and repayment_term).
	 */
	public static double TuitionPayment(double grand_total, double repayment_apr, int repayment_term) {
		double monthly_payment = ((repayment_apr / 12) * (grand_total))
				/ (1 - (Math.pow((1 + repayment_apr), -(repayment_term))));
		return monthly_payment;
	}
}

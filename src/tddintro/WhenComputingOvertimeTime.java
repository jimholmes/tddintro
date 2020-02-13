package tddintro;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/*
 * Tests for the allowable overtime range. Above range tests are handled in WhenRaisingSupervisorReview.
 */
class WhenComputingOvertimeTime {

	@Test
	void then_41_hours_at_10_rate_returns_415() {
		HourlyWageComputer computer = new HourlyWageComputer();
		double wages = computer.computeWages(41, 10);
		assertEquals(415, wages);
	}
	
	@Test
	void then_max_allowable_hours_at_10_rate_returns_700() {
		HourlyWageComputer computer = new HourlyWageComputer();
		double wages = computer.computeWages(60, 10);
		assertEquals(700, wages);
	}

}

package tddintro;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/*
 * Tests covering the two cases where a supervisor review is needed. The system is only a single algorithm, so 
 * obviously we don't handle raising a review--this is simply meant to foster discussion around different ways
 * a team might solve problems around business rules.
 * 
 * Another approach might be to throw custom exceptions for these business rules, rather than returning
 * error codes. Either approach (or others!) are completely OK. The larger point being: discuss these situations
 * as a team and make sure the approach is consistent across the entire architecture and system.
 */
class WhenRaisingSupervisorReview {

	@Test
	void when_working_61_hours_flag_for_review() {
		HourlyWageComputer computer = new HourlyWageComputer();
		
		double wages = computer.computeWages(61, 10);
		
		assertEquals(HourlyWageComputer.ERR_OVER_MAX_ALLOWABLE_HOURS, wages);
	}
	
	@Test
	void when_working_at_501_rate_flag_for_review() {
		HourlyWageComputer computer = new HourlyWageComputer();
		double wages = computer.computeWages(10, 501);
		assertEquals(HourlyWageComputer.ERR_OVER_MAX_ALLOWABLE_RATE, wages);
	}

}

package tddintro;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

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

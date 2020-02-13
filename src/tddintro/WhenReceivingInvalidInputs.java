package tddintro;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/*
 * As with tests in WhenRaisingSupervisorReview, this approach is just one of many. I'm demonstrating
 * different ways to deal with different situations, two possibilities of which are raising exceptions and returning
 * error codes.
 * 
 * Talk with the other humans on your team, figure out the best approach that's consistent across the architecture.
 */
class WhenReceivingInvalidInputs {

	@Test
	void then_negative_hours_throws_InvalidArgumentException() {
		HourlyWageComputer computer = new HourlyWageComputer();
		
		IllegalArgumentException ex = assertThrows(IllegalArgumentException.class,
				() ->
		computer.computeWages(-1, 10));
		
		assertTrue(ex.getMessage().contains("Negative hours"));

	}
	
	@Test
	void then_negative_rate_throws_InvalidArgumentException() {
		HourlyWageComputer computer = new HourlyWageComputer();
		IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, 
				() ->
			computer.computeWages(1, -1));
		assertTrue(ex.getMessage().contains("Negative rate"));
	}

}

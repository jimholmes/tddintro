package tddintro;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

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

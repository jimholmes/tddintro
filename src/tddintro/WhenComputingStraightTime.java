package tddintro;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/*
 * Tests for all cases using standard/straight time (0-40). Includes boundary tests for hours and rate.
 */
class WhenComputingStraightTime {
	
	 HourlyWageComputer computer;
	
	@BeforeEach
	 void run_every_time() {
		/*
		 * BeforeEach can be used to initialize state before *EACH* test runs. Don't overuse this,
		 * as keeping some state info in each test improves readability.
		 */
		computer = new HourlyWageComputer();
	}

	@Test
	void then_40_hours_at_10_rate_returns_400() {
		
		// Pulled out into BeforeEach
		//HourlyWageComputer computer = new HourlyWageComputer();
		
		double wages = computer.computeWages(40, 10);
		
		assertEquals(400, wages);	
	}

	@Test
	void then_1_hour_at_10_rate_10_returns_10() {
		double wages = computer.computeWages(1, 10);
		
		assertEquals(10, wages);
	}
	
	/*
	 * Semi-redundant test as it's covered by the 1 hour; however, I prefer to have an explicit
	 * test for zero values, as zero is just weird and evil.
	 */
	@Test
	void then_0_hours_at_10_rate_returns_0() {
		double wages = computer.computeWages(0, 10);
		
		assertEquals(0, wages);
	}
	
	@Test
	void then_1_hour_at_1_rate_returns_1() {
		double wages = computer.computeWages(1, 1);
		assertEquals(1, wages);
	}
	
	@Test
	void then_1_hour_at_500_rate_returns_500() {
		double wages = computer.computeWages(1, 500);
		assertEquals(500, wages);
	}
}

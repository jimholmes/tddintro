package tddintro;


public class HourlyWageComputer {

	public static final int MAX_STANDARD_HOURS_PER_WEEK = 40;
	public static final float OVERTIME_FACTOR = 1.5f;
	public static final int MAX_ALLOWABLE_RATE = 500;
	public static final int MAX_ALLOWABLE_WEEKLY_HOURS = 60;
	public static final int ERR_OVER_MAX_ALLOWABLE_RATE = -2;
	public static final int ERR_OVER_MAX_ALLOWABLE_HOURS = -1;

	public double computeWages(int hoursWorked, int hourlyRate) {
		if (hoursWorked<0) {
			throw new IllegalArgumentException("Negative hours:" + hoursWorked);
		}
		if (hourlyRate < 0) {
			throw new IllegalArgumentException("Negative rate: " + hourlyRate);
		}
		if(hoursWorked > MAX_ALLOWABLE_WEEKLY_HOURS) {
			return ERR_OVER_MAX_ALLOWABLE_HOURS;
		}
		if (hourlyRate > MAX_ALLOWABLE_RATE) {
			return ERR_OVER_MAX_ALLOWABLE_RATE;
		}
		double wages = 0;
		if (hoursWorked > MAX_STANDARD_HOURS_PER_WEEK) {
			double overtimeWages = (hoursWorked - MAX_STANDARD_HOURS_PER_WEEK) * hourlyRate * OVERTIME_FACTOR;
			wages = (MAX_STANDARD_HOURS_PER_WEEK * hourlyRate) + overtimeWages;
		} else {
			wages =hoursWorked*hourlyRate; 
		}
		return wages;
	}

}

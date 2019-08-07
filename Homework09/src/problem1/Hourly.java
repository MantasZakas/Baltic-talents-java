package problem1;

public class Hourly extends Employee{
	
	protected double hoursWorked;

	/**
	 * @param name
	 * @param surname
	 * @param phone
	 * @param nIn
	 * @param salary
	 */
	public Hourly(String name, String surname, String phone, String nIn, Double salary) {
		super(name, surname, phone, nIn, salary);
		this.hoursWorked = 0.0;
	}
	
	/**
	 * Add hours worked
	 * @param hours
	 */
	public void addHours(double hours) {
		this.hoursWorked += hours;
	}
	
	/**
	 * Calculate payment
	 */
	public double pay() {
		double totalPay = salary * hoursWorked;
		hoursWorked = 0.0;
		return totalPay;
	}
	
}

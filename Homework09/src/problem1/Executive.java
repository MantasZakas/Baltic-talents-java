package problem1;

public class Executive extends Employee{

	protected Double bonus;

	/**
	 * @param name
	 * @param surname
	 * @param phone
	 * @param nIn
	 * @param salary
	 */
	public Executive(String name, String surname, String phone, String nIn, Double salary) {
		super(name, surname, phone, nIn, salary);
		this.bonus = 0.0;
	}
	
	/**
	 * Add bonus pay
	 * @param bonus
	 */
	public void awardBonus(double bonus) {
		this.bonus += bonus;
	}
	
	/**
	 * Calculate payment
	 */
	public double pay() {
		double totalPay = salary + bonus;
		bonus = 0.0;
		return totalPay;
	}
	
}

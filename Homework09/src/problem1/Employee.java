package problem1;

public class Employee extends StaffMember{

	protected String nIn;
	protected Double salary;
	
	/**
	 * @param name
	 * @param surname
	 * @param phone
	 * @param nIn
	 * @param salary
	 */
	public Employee(String name, String surname, String phone, String nIn, Double salary) {
		super(name, surname, phone);
		this.nIn = nIn;
		this.salary = salary;
	}

	/**
	 * @return the nIn
	 */
	public String getnIn() {
		return nIn;
	}

	/**
	 * @param nIn the nIn to set
	 */
	public void setnIn(String nIn) {
		this.nIn = nIn;
	}

	/**
	 * @return the salary
	 */
	public Double getSallary() {
		return salary;
	}

	/**
	 * @param sallary the salary to set
	 */
	public void setSallary(Double sallary) {
		this.salary = sallary;
	}
	
	/**
	 * Calculate payment
	 */
	public double pay() {
		return salary;
	}
	
}

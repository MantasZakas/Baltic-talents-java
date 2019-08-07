package lectureProblem1;

public class Manager extends Employee {

	public Integer employeeCount;
	
	/**
	 * Construct employee object
	 * @param name
	 * @param surname
	 * @param workingHours
	 * @param rate
	 * @param employeeCount
	 */
	public Manager(String name, String surname, Double workingHours, Double rate, Integer employeeCount) {
		super(name, surname, workingHours, rate);
		this.employeeCount = employeeCount;
	}

	/**
	 * @return the employeeCount
	 */
	public Integer getEmployeeCount() {
		return employeeCount;
	}

	/**
	 * @param employeeCount the employeeCount to set
	 */
	public void setEmployeeCount(Integer employeeCount) {
		this.employeeCount = employeeCount;
	}

	/**
	 * Calculate salary
	 * @return salary
	 */
	public double getSalary() {
		return super.getSalary() + this.employeeCount * this.workingHours;
	}
	
}

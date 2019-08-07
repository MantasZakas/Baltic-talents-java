package lectureProblem1;

public class Employee {

	public String name;
	public String surname;
	public Double workingHours;
	public Double rate;

	/**
	 * Construct employee object
	 * @param name
	 * @param surname
	 * @param workingHours
	 * @param rate
	 */
	public Employee(String name, String surname, Double workingHours, Double rate) {
		super();
		this.name = name;
		this.surname = surname;
		this.workingHours = workingHours;
		this.rate = rate;
	}

	/**
	 * Convert object to sting
	 */
	public String toString() {
		return "Name: " + name + ", surname: " + surname + ", workingHours: " + workingHours + ", rate " + rate;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the surname
	 */
	public String getSurname() {
		return surname;
	}

	/**
	 * @param surname the surname to set
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}

	/**
	 * @return the workingHours
	 */
	public Double getWorkingHours() {
		return workingHours;
	}

	/**
	 * @param workingHours the workingHours to set
	 */
	public void setWorkingHours(Double workingHours) {
		this.workingHours = workingHours;
	}

	/**
	 * @return the rate
	 */
	public Double getRate() {
		return rate;
	}

	/**
	 * @param rate the rate to set
	 */
	public void setRate(Double rate) {
		this.rate = rate;
	}
	
	/**
	 * Calculate salary
	 * @return salary
	 */
	public double getSalary() {
		return this.workingHours * this.rate;
	}
	
}

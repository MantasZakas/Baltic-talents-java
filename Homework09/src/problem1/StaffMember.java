package problem1;

public class StaffMember {

	protected String name;
	protected String surname;
	protected String phone;
	
	/**
	 * Construct a staff member object
	 * @param name
	 * @param surname
	 * @param phone
	 */
	public StaffMember(String name, String surname, String phone) {
		this.name = name;
		this.surname = surname;
		this.phone = phone;
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
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * Convert a staff member object to string
	 */
	public String toString() {
		return "Name: " + name + "; Surname: " + surname + "; Phone: " + phone;
	}
	
	/**
	 * Default 0
	 * @return pay
	 */
	public double pay() {
		return 0.0;
	}
	
	
	
	
	
}

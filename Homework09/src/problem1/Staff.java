package problem1;

import java.util.Arrays;

public class Staff {
	
	StaffMember[] staffList;
	
	/**
	 * @param staffList
	 */
	public Staff() {
		super();
		this.staffList =  new StaffMember[0];
	}

	/**
	 * Add a new staff member to the staff list
	 * @param staff
	 */
	public void addStaffMember (StaffMember staff) {
		this.staffList = Arrays.copyOf(this.staffList, this.staffList.length + 1);
		this.staffList[this.staffList.length - 1] = staff;
	}
	
	/**
	 * Display a payment list and return the total amount paid
	 * @return
	 */
	public double payDay() {
		double totalPay = 0;
		for (StaffMember staffmember: this.staffList) {
			double salary = staffmember.pay();
			totalPay += salary;
			System.out.println(staffmember +  ", payment: " + salary);
		}
		System.out.println();
		System.out.println("Total pay: " + totalPay);
		return totalPay;
	}
}

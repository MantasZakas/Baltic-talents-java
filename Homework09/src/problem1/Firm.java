package problem1;

public class Firm {

	public static void main(String[] args) {

		Staff untitledCompany = new Staff();
		
		Employee johnSmith = new Employee("John", "Smith", "01", "901", 1000.0);
		Employee jackBrown = new Employee("Jack", "Brown", "02", "902", 1000.0);
		Trainee marySmith = new Trainee("Mary", "Smith", "03");
		Executive peterDoe = new Executive("Peter", "Doe", "04", "904", 1500.0);
		Hourly annGrey = new Hourly("Ann", "Grey", "05", "905", 10.0);
		Hourly benSmith = new Hourly("Ben", "Smith", "06", "906", 10.0);
		
		untitledCompany.addStaffMember(johnSmith);
		untitledCompany.addStaffMember(jackBrown);
		untitledCompany.addStaffMember(marySmith);
		untitledCompany.addStaffMember(peterDoe);
		untitledCompany.addStaffMember(annGrey);
		untitledCompany.addStaffMember(benSmith);
		
		peterDoe.awardBonus(150.0);
		annGrey.addHours(10.0);
		benSmith.addHours(20.0);
		
		double totalPay = untitledCompany.payDay();

	}

}

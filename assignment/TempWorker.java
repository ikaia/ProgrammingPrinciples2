package assignment;

public class TempWorker implements Employee{

	/**
	 * @param nameOfEmp
	 * @param id
	 */
	public TempWorker(String nameOfEmp, int id) {
	}
	
	/**
	 * Calculate the pay due to the employee based on rate and hours worked.
	 * Include overtime pay (over 40 hours) in calculation: Hourly pay rate x 1.5 x overtime hours worked.
	 */
	@Override
	public double calcPay() {
		return -1;
	}

	/**
	 * Setter for hoursWorked
	 */
	@Override
	public void setHoursWorked(double hrsWrked) {
	}

	/**
	 * Getter for hoursWorked
	 * @return hoursWorked
	 */
	@Override
	public double getHoursWorked() {
		return -1.0;
	}

	/**
	 * Setter for payRate
	 */
	@Override
	public void setPayRate(double payRate) {
	}

	/**
	 * Getter for payRate
	 * @return payRate
	 */
	@Override
	public double getPayRate() {
		return -1.0;
	}

	/**
	 * Getter for id
	 * @return id
	 */
	@Override
	public int getId() {
		return -1;
	}

	/**
	 * Getter for nameOfEmp
	 * @return nameOfEmp
	 */
	public String getNameOfEmp() {
		return "";
	}

	public void setNameOfEmp(String nameOfEmp) {
	}

	/**
	 * @return String that mentions the employee's name, id, and the pay for the period
	 * e.g.

		Daisy 321 - pay for this period is $500.00

	 */
	public String toString() {
		return "";
	}

}

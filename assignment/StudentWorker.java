package assignment;

import assignment.Student;

public class StudentWorker extends Student implements Employee {
	private double hoursWorked;
	private double payRate;
	

	//See Assignment 3 or "High Level View of Your Tasks" in Folio to see what Student contains
	
	/**
	 * @param stuName passed to super
	 * @param stuID passed to super
	 */
	public StudentWorker(String stuName, int stuID) {
		super(stuName, stuID);
	}

	/**
	 * Calculate the pay due to the employee based on rate and hours worked.
	 * Include overtime pay in calculation: Hourly pay rate x 1.5 x overtime hours worked.
	 * Include bonus for student's computed average: 
	 * $300 for 90.0 or greater
	 * $200 for 80. or greater
	 * $100 for 70.0 or greater
	 */
	@Override
	public double calcPay() {
		double pay = 0;
		double overtime = (getHoursWorked() - 40);
		
		pay = getPayRate() * (getHoursWorked() - overtime);
		if (getHoursWorked() > 40) {
			pay += (getPayRate() * 1.5) * overtime;
		}
		else if (getHoursWorked() <= 40) {
			pay = getPayRate() * getHoursWorked();
		}
		if (computeMyAverage() >= 90) {
			pay += 300;
		}
		else if (computeMyAverage() >= 80) {
			pay += 200;
		}
		else if (computeMyAverage() >= 70) {
			pay += 100;
		}
		return pay;
			
	}

	/**
	 * Setter for hoursWorked
	 */
	@Override
	public void setHoursWorked(double hrsWrked) {
		this.hoursWorked = hrsWrked;
		
	}

	/**
	 * Getter for hoursWorked
	 * @return hoursWorked
	 */
	@Override
	public double getHoursWorked() {
		return hoursWorked;
	}

	/**
	 * Setter for payRate
	 */
	@Override
	public void setPayRate(double payRate) {
		this.payRate = payRate;
	}

	/**
	 * Getter for payRate
	 * @return payRate
	 */
	@Override
	public double getPayRate() {
		return payRate;
	}

	/**
	 * @return String that mentions the super's toString and the pay for the period
	 * e.g.

		Bugsy 521 - pay for this period is $960.00

	 */
	public String toString() {
		return String.format("%s - pay for this period is $%.2f", super.toString(), calcPay());
	}
}

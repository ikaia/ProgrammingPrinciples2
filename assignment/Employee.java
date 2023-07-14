package assignment;

public interface Employee {

	public double calcPay();
	
	public void setHoursWorked(double hrsWrked);
	
	public double getHoursWorked();
	
	public void setPayRate(double payRate);
	
	public double getPayRate();
	
	public int getId();
	
	public String toString();
	
	public boolean equals(Object other);
}
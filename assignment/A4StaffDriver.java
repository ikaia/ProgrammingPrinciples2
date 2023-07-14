package assignment;

public class A4StaffDriver {

	public static void main(String[] args) {
		
		Staff staff = new Staff();
		
		//TempWorker Class
		TempWorker tmp1 = new TempWorker("Daffy",125);
	
		TempWorker tmp2 = new TempWorker("Doris", 123);
		
		tmp1.setHoursWorked(50);
		tmp1.setPayRate(12.0);
		
		tmp2.setHoursWorked(20);
		tmp2.setPayRate(15.0);

		//StudentWorker Class
		StudentWorker stu1 = new StudentWorker("Bugsy",521);
		stu1.AddScore(new Score("q1", 90.1));
		stu1.AddScore(new Score("q2", 87.21));
		stu1.AddScore(new Score("q3", 94));
	
		StudentWorker stu2 = new StudentWorker("Daisy", 321);
		stu2.AddScore(new Score("q1", 80.36));
		stu2.AddScore(new Score("q2", 92.70));
		stu2.AddScore(new Score("q3", 86.3));
		
		stu1.setHoursWorked(50);
		stu1.setPayRate(12.0);
		
		stu2.setHoursWorked(20);
		stu2.setPayRate(15.0);

		//Adding employees to staff object
		staff.addEmployee(stu1);
		staff.addEmployee(tmp1);
		staff.addEmployee(tmp2);
		staff.addEmployee(stu2);
		
		System.out.println("Total pay for all employees on staff is $"+staff.calcPayForAllEmployees()+"\n");
		
		System.out.println(staff.toStringOnlyStudentWorkers());

		System.out.println(staff.toStringOnlyTempWorkers());
	}

}


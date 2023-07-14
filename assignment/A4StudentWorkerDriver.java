package assignment;

public class A4StudentWorkerDriver {


	public static void main(String[]args) {
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

		System.out.println(stu1);
		System.out.println(stu1.calcPay());

		System.out.println(stu2.calcPay());
		System.out.println(stu2);

	}

}

package assignment;

public class A4TempWorkerDriver {


	public static void main(String[]args) {
		//TempWorker Class
		TempWorker tmp1 = new TempWorker("Daffy",125);
	
		TempWorker tmp2 = new TempWorker("Doris", 123);
		
		tmp1.setHoursWorked(50);
		tmp1.setPayRate(12.0);
		
		tmp2.setHoursWorked(20);
		tmp2.setPayRate(15.0);

		System.out.println(tmp1);
		System.out.println(tmp1.calcPay());

		System.out.println(tmp2.calcPay());
		System.out.println(tmp2);

	}

}
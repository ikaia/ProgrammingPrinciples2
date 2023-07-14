package lab;

import java.util.Comparator;
import assignment.Employee;

public class SsnHighestToLowest implements Comparator <Employee> {

		public int compare(Employee o1, Employee o2) {
		if(o1.getId()>o2.getId()) { //call the calcPay method on o1 and 02 then compare them
		return -1;
		}else if(o1.getId()==o2.getId()) {
		return 0;
		}else return 1;
		}
	}
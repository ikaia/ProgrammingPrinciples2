package assignment;

public class A6Driver {
	public static void main(String[] args) { 
		//This is just a few test to get you started. Add your own to test the code
		RecurAssign recurAssign = new RecurAssign();
		System.out.println(recurAssign.sumEvenNumbersOnly(-3, 5)); //4
		System.out.println(recurAssign.sumEvenNumbersOnly(3, 7)); //10
		System.out.println(recurAssign.sumEvenNumbersOnly(0, 5)); //6
	
		System.out.println(recurAssign.removeAs(null)); // empty string
		System.out.println(recurAssign.removeAs("a")); //empty string
		System.out.println(recurAssign.removeAs("A")); // empty string
		System.out.println(recurAssign.removeAs("Allan")); // lln

	}


}

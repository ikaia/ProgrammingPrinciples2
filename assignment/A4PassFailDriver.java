package assignment;
public class A4PassFailDriver {

	public static void main(String[] args) {
		//NOTE: BELOW IS A STARTER SET OF TEST FOR YOUR ASSIGNMENT. 
		//IT IS NOT THE ONLY SET OF TESTS YOU SHOULD DO FOR YOUR ASSIGNMENT! 
		
		//Student Class
		Student stu1 = new Student("Bugsy",521);
		stu1.AddScore(new Score("q1", 90.1));
		stu1.AddScore(new Score("q2", 87.21));
		stu1.AddScore(new Score("q3", 94));

		Student stu2 = new Student("Daisy", 321);
		stu2.AddScore(new Score("q1", 80.36));
		stu2.AddScore(new Score("q2", 92.70));
		stu2.AddScore(new Score("q3", 86.3));

		Student stu3 = new Student("Minny",876);
		stu3.AddScore(new Score("q1", 75.75));
		stu3.AddScore(new Score("q2", 83.45));
		stu3.AddScore(new Score("q3", 78.98));

		Student stu4 = new Student("Mikey",543);
		stu4.AddScore(new Score("q1", 60.99));
		stu4.AddScore(new Score("q2", 78.67));
		stu4.AddScore(new Score("q3", 50.38));

		//PassFailCourse object stored in Course object reference variable
		Course cou = new PassFailCourse("Underwater Basket Weaving");
		System.out.println("Add Student to course successfully ->"+ cou.addStudent(stu1));		
		System.out.println("Add Student to course successfully ->"+ cou.addStudent(stu2));		
		System.out.println("Add Student to course successfully ->"+ cou.addStudent(stu3));		
		System.out.println("Add Student to course successfully ->"+ cou.addStudent(stu4));
		
		//PassFailCourse overrides computeCourseAverage so it returns the percentage of students that are passing (at or above 75%)
		System.out.println("Percentage of students with grade above 75% ->"+ cou.computeCourseAverage());
		
		System.out.println("Number of Students in the Course ->"+ cou.getAllStudents().size());
		
		System.out.println("toString prints the following\n"+cou.toString());
		

		
	}


}

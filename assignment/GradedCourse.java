package assignment;

import assignment.Course;

public class GradedCourse extends Course {

	public double minScoreForA;
	public double minScoreForB;
	public double minScoreForC;
	public double minScoreForD;
	int countA = 0;
	int countB = 0;
	int countC = 0;
	int countD = 0;
	
	
	 public String countABCDFStudents() {
		 for (int i = 0; i < getAllStudents().size(); i++) {
			 //get all students, i from index list till end loop, then get average, then compare that to letter grade
			 if (getAllStudents().get(i).computeMyAverage() >= minScoreForA) {
				 countA++;
			 }
			 else if (getAllStudents().get(i).computeMyAverage() >= minScoreForB) {
				 countB++;
			 }
			 else if (getAllStudents().get(i).computeMyAverage() >= minScoreForC) {
				 countC++;
			 }
			 else if (getAllStudents().get(i).computeMyAverage() >= minScoreForD) {
				 countD++;
			 }
			
		 }
			return "\n" + getCountA() + " students on track for A\n" +  getCountB() + " students on track for B\n" +  getCountC() + " students on track for C\n" +  getCountD() + " students on track for D\n";
			
		}
	 
	
	public double getMinScoreForA() {
		return minScoreForA;
	}


	public double getMinScoreForB() {
		return minScoreForB;
	}


	public double getMinScoreForC() {
		return minScoreForC;
	}


	public double getMinScoreForD() {
		return minScoreForD;
	}


	public int getCountA() {
		return countA;
	}


	public int getCountB() {
		return countB;
	}


	public int getCountC() {
		return countC;
	}


	public int getCountD() {
		return countD;
	}


	public GradedCourse(String courseName, double minScoreForA, double minScoreForB, double minScoreForC, double minScoreForD) {
		super(courseName);
		this.minScoreForA = minScoreForA;
		this.minScoreForB = minScoreForB;
		this.minScoreForC = minScoreForC;
		this.minScoreForD = minScoreForD;
		
	}
	
	public String toString() {
		return super.getCourseName() + " is a letter grade course. " + countABCDFStudents() + "\n" + super.toString();
		
	}
	

}

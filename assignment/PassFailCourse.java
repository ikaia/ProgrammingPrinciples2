package assignment;

import assignment.Course;

public class PassFailCourse extends Course {
	

	public PassFailCourse(String courseName) {
		super(courseName);
	}
	public double computeCourseAverage()  {
		double passCount = 0.0;
		double classSize = getAllStudents().size();
		for (int i = 0; i < classSize;i++) {
			if (this.getAllStudents().get(i).computeMyAverage() >= 75) {
				passCount++;
			}
		}
		return passCount/classSize * 100;
		
	}
	public String toString() {
		return super.getCourseName() + " is a pass/fail course. " + String.format("%.2f", computeCourseAverage())+ "% of the class are on track to pass the course. Students in this course:" + "\n" + super.getAllStudents();

		
	}
}

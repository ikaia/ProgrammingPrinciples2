package lab;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

import assignment.Employee;
import assignment.Score;
import assignment.StudentWorker;
import assignment.TempWorker;

public class Staff {

	public static void main(String[] args) {
		
		 Staff staff = new Staff();
	        staff.readFromTextFile("EmployeeRawData.csv");

	        System.out.println("Total pay for all employees on staff is $"+staff.calcPayForAllEmployees()+"\n");
	        
	        System.out.println(staff.toStringOnlyStudentWorkers());

	        System.out.println(staff.toStringOnlyTempWorkers());
	    
	        System.out.println("All Employees and salary before sorting"+staff.getAllEmployees()+"\n");
	        Collections.sort(staff.getAllEmployees(), new CalcPayLowestToHighestComparator());
	        System.out.println("All Employees and salary after sort"+staff.getAllEmployees()+"\n");
	        
	        System.out.println("All Employees and salary before sorting"+staff.getAllEmployees()+"\n");
	        Collections.sort(staff.getAllEmployees(), new CalcPayHighestToLowestComparator());
	        System.out.println("All Employees and salary after sort"+staff.getAllEmployees()+"\n");
	        
	        System.out.println("All Employees and salary before sorting"+staff.getAllEmployees()+"\n");
	        Collections.sort(staff.getAllEmployees(), new SsnHighestToLowest());
	        System.out.println("All Employees and salary after sort"+staff.getAllEmployees()+"\n");
	}

	private ArrayList<Employee> allEmployees = new ArrayList<Employee>();

	/**
	 * @return the allEmployees
	 */
	public ArrayList<Employee> getAllEmployees() {
		return allEmployees;
	}

	/**
	 * @param allEmployees the allEmployees to set
	 */
	public void setAllEmployees(ArrayList<Employee> allEmployees) {
		this.allEmployees = allEmployees;
	}

	public void addEmployee(Employee worker) {
		this.allEmployees.add(worker);
	}

	public String toStringOnlyStudentWorkers() {
		String out = "";
		for (int i = 0; i < this.allEmployees.size(); i++) {
			if (this.allEmployees.get(i) instanceof StudentWorker) {
				out += this.allEmployees.get(i) + "\n";
			}
		}
		return out;
	}

	public String toStringOnlyTempWorkers() {
		String out = "";
		for (int i = 0; i < this.allEmployees.size(); i++) {
			if (this.allEmployees.get(i) instanceof TempWorker) {
				out += this.allEmployees.get(i) + "\n";
			}
		}
		return out;
	}

	public double calcPayForAllEmployees() {
		double out = 0;
		for (int i = 0; i < this.allEmployees.size(); i++) {
			out += this.allEmployees.get(i).calcPay();
		}
		return out;
	}

	public int readFromTextFile(String filenameAndPath) {

		int countOfBadLines = 0;
		filenameAndPath = "C:\\Users\\Isaiah Melton\\Downloads\\Lab6\\EmployeeRawData.csv";
		// try catch block for exceptions
		try {// start of outer try block
				// open the text file
			FileReader fr = new FileReader(filenameAndPath); // Creates a new FileReader, given the name of the file to
																// read from.
			BufferedReader br = new BufferedReader(fr);// Reads text from a character-input stream, buffering characters
														// so as to provide for the efficient reading

			// read the info from the file
			String aLineFromTheTextFile = br.readLine(); // Read the first line from the opened test file
			while(aLineFromTheTextFile!=null) {//loop until readLine() returns null
                try {//start of our inner try block
				
				
				String[] dataForASingleEmployee = aLineFromTheTextFile.split(",");// one line is one employee's info.
																					// Fields are separated by # symbol
				String name = dataForASingleEmployee[0];// first field is name
				int id = Integer.parseInt(dataForASingleEmployee[1]); // second field is SSN <--------------
				double payRate = Double.parseDouble(dataForASingleEmployee[2]); // third field is pay rate per hour
				double hoursWorked = Double.parseDouble(dataForASingleEmployee[3]); // fourth field is hours worked for
																					// the period
				// TempWorker only needs these 4 fields so if we have only 4 fields then this is
				// a TempWorker
				if (dataForASingleEmployee.length == 4) {// TempWorker
					TempWorker temp = new TempWorker(name, id); // create TempWorker object
					temp.setHoursWorked(hoursWorked); // add hours worked for the period
					temp.setPayRate(payRate); // set pay rate per hour
					this.addEmployee(temp); // add employee
				} // end if
					// StudentWorker needs the 4 previous fields plus 6 others, so if we have 10
					// fields then this is a StudentWorker
				else if (dataForASingleEmployee.length == 10) {// StudentWorker
					StudentWorker temp = new StudentWorker(name, id); // create StudentWorker object
					temp.setHoursWorked(hoursWorked);// add hours worked for the period
					temp.setPayRate(payRate); // set pay rate per hour
					String s1Name = dataForASingleEmployee[4]; // get the score name
					double s1Val = Double.parseDouble(dataForASingleEmployee[5]); // get the score value
					temp.AddScore(new Score(s1Name, s1Val)); // Create a Score object and add to StudentWorker
					String s2Name = dataForASingleEmployee[6];// get the score name
					double s2Val = Double.parseDouble(dataForASingleEmployee[7]);// get the score value
					temp.AddScore(new Score(s2Name, s2Val));// Create a Score object and add to StudentWorker
					String s3Name = dataForASingleEmployee[8];// get the score name
					double s3Val = Double.parseDouble(dataForASingleEmployee[9]);// get the score value
					temp.AddScore(new Score(s3Name, s3Val));// Create a Score object and add to StudentWorker
					this.addEmployee(temp); // add employee
				} // end elseif
				else {// we did not have exactly 4 or 10 fields to consider the line useful for
						// creating a StudentWorker or TempWorker
					System.out.println(
							"Did not have exactly 4 or 10 fields to consider the line useful for creating an Employee"
									+ (++countOfBadLines));
				} // end else
				// aLineFromTheTextFile = br.readLine(); // read the next line <-----------DELETE TO SEE ALL 20 
                }//end inner try 
                catch (IndexOutOfBoundsException iobe) {
                    //we had less fields than expected on the text line
                    System.out.println("Whoops! We had less fields than expected!");
                }//end catch
                aLineFromTheTextFile = br.readLine(); //read the next line

			  }//end while
        //close file
        br.close();
			fr.close();
		} // end outer try
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // end catch
		return countOfBadLines;
	}

public int writeToTextFile(String filenameAndPath) {
    int count=0; //count the number of employee objects successfully written to the file
    try {
        //open file
        FileWriter fw = new FileWriter(filenameAndPath); //Create a filewriter object 
        BufferedWriter bw = new BufferedWriter(fw); // create a bufferedwriter object to write to a stream
        
        //write info to the file
        for(int i=0; i < this.getAllEmployees().size(); i++) { //loop through the arraylist of employees
            bw.write(this.getAllEmployees().get(i).toString());//write the output of the toString to the file
            bw.newLine();//add a new line at the end
            count++; //increment the count of employee info written so far
        }
        //close file
        bw.close();
        fw.close();
    } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    return count;
}
}

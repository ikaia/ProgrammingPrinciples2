package assignment;

public class MyStackTrace {
	public static void printTrace() {
		StackTraceElement [] trace =Thread.currentThread().getStackTrace(); 
		for(int i=2; i<trace.length-26; i++) {
			int stopIndex = trace[i].toString().indexOf('(');
			System.out.println(trace[i].toString().substring(0, stopIndex));
		}
	}

}


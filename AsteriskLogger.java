package week5CodingAssignment;

public class AsteriskLogger implements Logger {

	@Override
	public void log(String log) {
		System.out.println("***" + log + "***");
		
	}

	@Override
	public void error(String error) {
		System.err.println("*******************\n\n" + "***Error: " + error + "***" + "\n\n*******************");	
	}

}

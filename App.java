package week5CodingAssignment;

public class App {

	public static void main(String[] args) {

		Logger logger = new AsteriskLogger();
	
		logger.log("100%");
		logger.error("100%");

		
		
		Logger logger2 = new SpacedLogger();
		
		logger2.log("100%");
		logger2.error("100%");
		
	}

}

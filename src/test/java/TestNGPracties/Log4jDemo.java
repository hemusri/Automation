package TestNGPracties;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jDemo {

	private static Logger logger = LogManager.getLogger(Log4jDemo.class);
	
	
	public static void main(String[] args) 
	{

		System.out.println("\n    Heloo world ....!  \n");
		
		logger.trace("This is tracelevel message ");
		logger.info("This is information message ");
		logger.error("This is error message");
		logger.warn("This is warn message");
		logger.fatal("This is fatal message");
		
		System.out.println("\n  Completed   ");
		
	}

}

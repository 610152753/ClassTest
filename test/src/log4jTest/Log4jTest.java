package log4jTest;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 * 
 * @author JoePotter
 *
 *config file is "src/log4j.properties"
 *
 */

public class Log4jTest
{
	public static void main(String[] args)
	{
		Logger log = LogManager.getLogger(Log4jTest.class);
		
		log.info("info通过 class 对象来获取 logger 对象");
		
		log.debug("debug通过 class 对象来获取 logger 对象");
		
		log.warn("warn通过 class 对象来获取 logger 对象");
	}

}

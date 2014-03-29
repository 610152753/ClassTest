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
		
		log.info("infoͨ�� class ��������ȡ logger ����");
		
		log.debug("debugͨ�� class ��������ȡ logger ����");
		
		log.warn("warnͨ�� class ��������ȡ logger ����");
	}

}

package annocationTest;

import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

/**
 * SuppressWarningsע���ʾ���ƾ���
 *
 */
public class SuppressWarningTest
{

	@SuppressWarnings({"unchecked","deprecation"})
	public static void main(String[] args)
	{
		
		Map map = new TreeMap();
		
		Date date = new Date();
		
		map.put("1", date);
		
		System.out.println(date.toLocaleString());
	}
	
	
}

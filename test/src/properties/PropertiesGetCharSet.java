package properties;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

/**
 * ��ȡϵͳ��������
 * 
 * @author JoePotter
 *
 */
public class PropertiesGetCharSet
{
	public static void main(String[] args)
	{
		Properties p = System.getProperties();
		
		Set set = p.keySet();
		
		for(Iterator iter = set.iterator();iter.hasNext();)
		{
		   String key = (String)iter.next();
		   String value = p.getProperty(key);
		   
		   System.out.println(key + "=" + value);
		}
	}
}
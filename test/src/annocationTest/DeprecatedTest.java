package annocationTest;

import java.util.Date;

/**
 * Deprecatedע���ʾ�����ǲ����鱻ʹ�õġ� 
 *
 */
public class DeprecatedTest
{
	
	/**
	 * �Զ����annocation
	 */
	@Deprecated
	public void doSomething()
	{
		System.out.println("Do Something !");
	}
	
	
	@Deprecated
	public static void main(String[] args)
	{
		
		
		DeprecatedTest test = new DeprecatedTest();
		
		test.doSomething();
		
		Date date = new Date();
		
		System.out.println(date.toLocaleString());
		
		
		
	}

}

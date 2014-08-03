package annocationTest;

import java.util.Date;

/**
 * Deprecated注解表示方法是不建议被使用的。 
 *
 */
public class DeprecatedTest
{
	
	/**
	 * 自定义的annocation
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

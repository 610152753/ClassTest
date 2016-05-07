package annotationTest;

/**
 * 
 *Override 注解表示子类要重写(override)父类的 对应的方法
 */
public class OverrideTest
{
	@Override
	public String toString()
	{
		return "This is OverrideTest !";
	}
	
	public static void main(String[] args)
	{
		OverrideTest test = new OverrideTest();
		
		System.out.println(test.toString());
	}

}

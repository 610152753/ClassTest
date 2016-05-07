package junitTest;

import org.junit.Test;
/**
 * Keep the bar green to keep the code clean
 * 
 * JUnit4的执行一般流程
 * 
 *1.首先获得待测试类的Class对象，
 *2.通过Class对象获得当前类中的所有public方法所对应的Mehtod数组。
 *3.遍历该Method数组，取得每一个Method对象
 *4.调用每个Method对象的isAnnotationPresent(Test.class)方法判断当该方法是否被Test注解所修饰
 *如果返回为true，那么使用method.invoke方法去执行该方法，否则不执行。
 * 
 * 单元测试不是为了证明你是对的，而是证明你没有错误
 * 
 * Writing Secure Code(编写安全的代码) :Input is evil.
 *
 */
public class Junit4Test
{
	@Test
	public void j4Test()
	{
		System.out.println("This is From JUnit4 Test !");
	}

}

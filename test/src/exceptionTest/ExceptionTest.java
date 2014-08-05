package exceptionTest;

/**
 * 
 * Java中的异常分为两大类：
 * 1.Checked excption(非Runtime Exception)
 * 2.Unchecked excption(Runtime Exception)
 *
 *
 *异常处理的一般结构是:
 *
 *Try
 *{
 *}
 *Catch(Exception e)
 *{
 * 
 *}
 *Finally
 *{
 *}
 *无论程序是否出现异常，Finally代码块都会被执行
 *
 *
 */
public class ExceptionTest
{
	public static void main(String[] args)
	{
		int a = 3;
		int c = 0;
		/**
		 * if b = 0;
		 * Exception in thread "main" java.lang.ArithmeticException: / by zero
		 * at exceptionTest.ExceptionTest.main(ExceptionTest.java:10)
		 */
		try{
		int b = 0;
		
		System.out.println("From Main Before!");
		
		c = a / b;
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("From Main Finally !");
		}
		System.out.println("From Main After!");
		
		System.out.println(c);
	}
}

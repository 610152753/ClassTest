package exceptionTest;

/**
 * 
 * Java�е��쳣��Ϊ�����ࣺ
 * 1.Checked excption(��Runtime Exception)
 * 2.Unchecked excption(Runtime Exception)
 *
 *
 *�쳣�����һ��ṹ��:
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
 *���۳����Ƿ�����쳣��Finally����鶼�ᱻִ��
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

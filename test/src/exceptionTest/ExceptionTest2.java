package exceptionTest;

/**
 *
 * Exception in thread "main" java.lang.NullPointerException
 * at exceptionTest.ExceptionTest2.main(ExceptionTest2.java:9)
 * 
 * 
 * NullPointerException是空指针异常，出现该异常的原因在于某个引用为null，
 * 但是却调用了它的某个方法。这时就会出现该异常。
 * 
 * 实际开发中很常见的异常。
 * 
 *
 */

public class ExceptionTest2
{
	public static void main(String[] args)
	{
		String str = null;
		
		System.out.println(str.length());
	}
}

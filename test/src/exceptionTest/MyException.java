package exceptionTest;


/**
 * 
 *所谓自定义异常，通常就是定义了一个继承自Exception类的子类，那么 这个类就是一个自定义的异常类。
 *通常情况下，我们会直接继承自Exception类，一般不会继承运行时的异常。
 *
 */
public class MyException extends Exception
{
	public MyException()
	{
		super();
	}
	
	public MyException(String message)
	{
		super(message);
	}
}

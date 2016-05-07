package exceptionTest;


/**
 * 对于非运行时异常(checked exception),必须要对其进行处理，处理方式有两种:
 * 1.在调用中产生异常的方法所在的方法上声明throws Exception 
 * 2.使用try{}catch(Exception e){}finally 进行捕获
 *
 * 
 * 对于运行时异常(runtime exception)，我们可以不对其进行处理，也可以对其进行处理。
 * 推荐不对其进行处理
 *
 */
public class ExceptionTest1
{
	public void method() throws Exception
	{
		System.out.println("From ExceptionTest1 method ！");
		
		throw new Exception();
	}
	
	public static void main(String[] args) 
	{
		ExceptionTest1 test = new ExceptionTest1();
		
		System.out.println("Invoke Before !");
		try
		{
		test.method();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("From Finally Src !");
		}
		
		System.out.println("Invoke After !");
	}
}

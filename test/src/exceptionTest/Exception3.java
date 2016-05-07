package exceptionTest;


/**
 * 
 *我们可以使用多个catch块来捕获异常，这时需要将父类型的catch块放到子类型的catch块之后，
 *这样才能保证后续的catch块可能被执行，否则子类型的catch将永远无法到达，java编译器会报
 *编译错误。
 *
 *如果多个catch块的异常类型是独立的(MyException,MyException1),那么谁前谁后都可以的
 * 
 */
public class Exception3
{
	public void method(String str) throws MyException,MyException1
	{
		if(null == str)
		{
			throw new MyException("传入的字符串参数不能为null");
		}
		else if("hello".equals(str))
		{
			throw new MyException1("输入的内容是:hello !");
		}else
		{
			System.out.println(str);
		}
	}
	
	
	public static void main(String[] args)
	{
		Exception3 e1 = new Exception3();
		try
		{
			e1.method("hello");
		}
		catch(MyException e)
		{
			System.out.println("进入输入是null的异常！before");
			e.printStackTrace();
			System.out.println("进入输入是null的异常！after ");
		}
//		catch(MyException1 e)
//		{
//			System.out.println("进入输入的是hello的异常！before");
//			e.printStackTrace();
//			System.out.println("进入输入的是hello的异常！after");
//		}
		catch(Exception e)
		{
			System.out.println("进入了Exception ！before");
			e.printStackTrace();
			System.out.println("进入了Exception ！before");
		}
		finally
		{
			System.out.println("程序即将处理完毕......");
		}
		
		System.out.println("程序处理完毕！");
		
	
	}
}

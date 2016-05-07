package exceptionTest;

public class Exception4
{
	public void method()
	{
		try
		{
			System.out.println("Try 块开始 ！");
//			return;
			/**
			 * 
			 * 如果这里是return时,运行结果如下:
			 * Try 块开始 ！
			 * 程序即将结束... ... !
			 * 
			 * 如果在try块中存在return语句，那么首先也需要将finally块中的代码执行
			 * 完毕，然后方法在返回
			 */
			
			System.exit(0);
			/**
			 * 
			 * System.exit(0);时
			 * 
			 * 系统java vm直接结束 运行结果如下:
			 * 
			 * Try 块开始 ！
			 * 
			 * 如果在try块中存在System.exit(0)语句，那么就不会执行finally块
			 * 中的代码，因为System.exit(0)会终止当前运行的java虚拟机，程序会在
			 * 虚拟机终止前结束执行。
			 * 
			 */

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("程序即将结束... ... !");
		}
		
		System.out.println("方法正常结束 ！");
	}
	
	public static void main(String[] args)
	{
		Exception4 test = new Exception4();
		
		test.method();
	}

}

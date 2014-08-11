package exceptionTest;


/**
 * ���ڷ�����ʱ�쳣(checked exception),����Ҫ������д�������ʽ������:
 * 1.�ڵ����в����쳣�ķ������ڵķ���������throws Exception 
 * 2.ʹ��try{}catch(Exception e){}finally ���в���
 *
 * 
 * ��������ʱ�쳣(runtime exception)�����ǿ��Բ�������д���Ҳ���Զ�����д���
 * �Ƽ���������д���
 *
 */
public class ExceptionTest1
{
	public void method() throws Exception
	{
		System.out.println("From ExceptionTest1 method ��");
		
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

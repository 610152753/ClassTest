package exceptionTest;

/**
 *
 * Exception in thread "main" java.lang.NullPointerException
 * at exceptionTest.ExceptionTest2.main(ExceptionTest2.java:9)
 * 
 * 
 * NullPointerException�ǿ�ָ���쳣�����ָ��쳣��ԭ������ĳ������Ϊnull��
 * ����ȴ����������ĳ����������ʱ�ͻ���ָ��쳣��
 * 
 * ʵ�ʿ����кܳ������쳣��
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

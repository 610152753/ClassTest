package exceptionTest;


/**
 * 
 *��ν�Զ����쳣��ͨ�����Ƕ�����һ���̳���Exception������࣬��ô ��������һ���Զ�����쳣�ࡣ
 *ͨ������£����ǻ�ֱ�Ӽ̳���Exception�࣬һ�㲻��̳�����ʱ���쳣��
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

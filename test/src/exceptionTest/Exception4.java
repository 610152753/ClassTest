package exceptionTest;

public class Exception4
{
	public void method()
	{
		try
		{
			System.out.println("Try �鿪ʼ ��");
//			return;
			/**
			 * 
			 * ���������returnʱ,���н������:
			 * Try �鿪ʼ ��
			 * ���򼴽�����... ... !
			 * 
			 * �����try���д���return��䣬��ô����Ҳ��Ҫ��finally���еĴ���ִ��
			 * ��ϣ�Ȼ�󷽷��ڷ���
			 */
			
			System.exit(0);
			/**
			 * 
			 * System.exit(0);ʱ
			 * 
			 * ϵͳjava vmֱ�ӽ��� ���н������:
			 * 
			 * Try �鿪ʼ ��
			 * 
			 * �����try���д���System.exit(0)��䣬��ô�Ͳ���ִ��finally��
			 * �еĴ��룬��ΪSystem.exit(0)����ֹ��ǰ���е�java��������������
			 * �������ֹǰ����ִ�С�
			 * 
			 */

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("���򼴽�����... ... !");
		}
		
		System.out.println("������������ ��");
	}
	
	public static void main(String[] args)
	{
		Exception4 test = new Exception4();
		
		test.method();
	}

}
